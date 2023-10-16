package linear.linkedlists;

public class SingleLinkedList {

    Node head;
    int size = 0;

    public void add(int data) {
        addLast(data);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.getNext();
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        Node previous = null;

        Node temp = head;
        while (temp.getNext() != null) {
            previous = temp;
            temp = temp.getNext();
        }
        previous.next = temp.next;

        size--;
    }

    public void deleteByKey(int key) {
        Node currentNode = head;
        if (currentNode != null && currentNode.data == key) {
            head = head.getNext();
        } else {
            Node prevNode = null;
            while (currentNode != null && currentNode.data != key) {
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (currentNode != null) {
                prevNode.next = currentNode.next;
            } else {
                System.out.println("Key not found::" + key);
            }
        }

    }

    public void deleteAtPosition(int index) {
        Node currentNode = head;

        if (currentNode != null) {
            if (index == 0) {
                head = head.getNext();
            } else {
                int counter = 1;
                Node prevNode = null;
                currentNode = currentNode.getNext();
                while (currentNode != null) {
                    if (index == counter) {
                        prevNode.next = currentNode.next;
                        return;
                    }
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                    counter++;
                }
            }
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        if (head != null) {
            sb.append(temp.data);
            temp = temp.getNext();
        }
        while (temp != null) {
            sb.append(",");
            sb.append(temp.data);
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
