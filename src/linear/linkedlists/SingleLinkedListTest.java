package linear.linkedlists;

public class SingleLinkedListTest {
    public static void main(String args[]) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(10);
        sl.add(20);
        sl.add(30);
        sl.addFirst(5);
        sl.addLast(40);
        sl.addLast(50);
        sl.addLast(60);
        sl.addLast(70);
        sl.addLast(80);

        System.out.println(sl);
        System.out.println(sl.size());
        sl.deleteFirst();
        sl.deleteLast();
        sl.deleteLast();
        System.out.println(sl);
        System.out.println(sl.size());
        sl.deleteByKey(40);
        System.out.println(sl);
        sl.deleteAtPosition(0);

        System.out.println(sl);
        sl.deleteAtPosition(3);
        System.out.println(sl);

    }
}
