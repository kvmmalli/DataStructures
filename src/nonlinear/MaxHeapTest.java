package nonlinear;

public class MaxHeapTest {
    public static void main(String args[])
    {
       MaxHeap m=new MaxHeap();
       m.insert(10);
       m.insert(20);
       m.insert(30);
       m.insert(40);
       m.insert(50);
       m.print();
       System.out.println();
       m.removeMax();
       m.print();
    }
}
