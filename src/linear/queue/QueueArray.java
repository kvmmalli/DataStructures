package linear.queue;

public class QueueArray {

    int arr[];
    int size=-1;
int front =-1;
int rear=-1;

    public QueueArray()
    {
        arr = new int[5];
    }

    public void enQueue(int data)
    {
       if(front==-1)
       {
         front=0;
       }
       arr[++rear]=data;
       size++;
    }

    public int deQueue()
    {
        int data=arr[front];
        if(front>=rear)
        {
            front=rear=-1;
        }
      else {
          front++;
        }
      size--;
      return data;
    }

    public int front()
    {
        return arr[front];
    }
    public int size()
    {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(arr[front]);
        for (int i = front + 1; i <= rear; i++) {
            sb.append(",");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
