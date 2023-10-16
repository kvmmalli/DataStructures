package linear.linkedlists;

public class DoubleLinkedList {

    Node head;
    int size = 0;

    public void addFirst(int data) {
        Node node = new Node(data, null, null);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;

    }

    public void addLast(int data) {
        Node node = new Node(data, null, null);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.next = node;
        }

    }

    public void addAtPosition(int data, int position) {
        Node node = new Node(data, null, null);
        if (position == 0) {
            node.setNext(head);
            head = node;
        } else {
            int counter = 1;
            Node temp = head;
            while (temp != null && position != counter) {
                temp = temp.getNext();
                counter++;
            }
            if (temp != null) {
                node.setNext(temp);
                node.setPrevious(temp.getPrevious());
            }
        }

    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            head.setPrevious(null);
        }
    }

    public void deleteLast() {
        if (head != null) {
            Node temp = head;
            Node previous = null;
            while (temp.getNext() != null) {
                previous = temp;
                temp = temp.getNext();
            }
            previous.next = temp.next;
            temp.previous = null;

        }
    }

    private static class Node {
        int data;
        Node next;
        Node previous;

        Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
}
