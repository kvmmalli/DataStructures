package linear.queue;

public class QueueArrayTest {
    public static void main(String args[])
    {
      QueueArray q=new QueueArray();
      q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        System.out.println(q);
        System.out.println(q.front());
        q.deQueue();
        q.deQueue();
        System.out.println(q);
    }
}
