package linear.stack;

public class StackArrayTest {
    public static void main(String args[])
    {
        StackArray sa=new StackArray();
        sa.push(10);
        sa.push(20);
        sa.push(30);
        System.out.println(sa);
        System.out.println(sa.peek());
        sa.pop();
        sa.pop();
        System.out.println(sa);
        System.out.println(sa.size());
        sa.push(20);
        sa.push(30);
        sa.push(40);
        sa.push(50);
        sa.push(60);
        System.out.println(sa);
    }
}
