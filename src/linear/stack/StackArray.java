package linear.stack;

public class StackArray {
    int arr[];
    int size = -1;
    int length = -1;

    public StackArray() {
        size = 5;
        arr = new int[size];

    }

    public void push(int data) {
        if (size-1 == length) {
            grow();
        }
        arr[++length] = data;
    }

    public int pop() {
        int data = arr[length];
        arr[length--] = -1;
        return data;
    }

    public int peek() {
        return arr[length];
    }

    public void grow() {
        int b[] = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        arr = b;
    }

    public int size() {
        return length + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(",");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
