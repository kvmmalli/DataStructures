package nonlinear;

public class MaxHeap {
    private int[] heap;

    private int size = 0;

  public  MaxHeap()
    {
      heap=new int[10];
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int getLeftChild(int index) {
        return (2 * index) + 1;
    }

    public int getRightChild(int index) {
        return (2 * index) + 2;
    }

    public void insert(int data) {
        heap[size] = data;
        int current = size;
        while (heap[current] > heap[getParent(current)]) {
            swap(current, getParent(current));
            current = getParent(current);
        }
        size++;
    }

    public void heapify(int pos) {
        if (isLeaf(pos)) {
            return;
        } else {
            if (heap[pos] < heap[getLeftChild(pos)] || heap[pos] < heap[getRightChild(pos)]) {
                if (heap[getLeftChild(pos)] > heap[getRightChild(pos)]) {
                    swap(pos, getLeftChild(pos));
                    heapify(getLeftChild(pos));
                } else {
                    swap(pos, getRightChild(pos));
                    heapify(getRightChild(pos));
                }
            }
        }
    }

    public int removeMax() {
        int popeed = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return popeed;

    }

    public void print() {

        for (int i = 0; i < size / 2; i++) {
            System.out.print("Parent :"+heap[i]);
            if (getLeftChild(i) < size) {
                System.out.print("Left child: " + heap[getLeftChild(i)]);
            }
            if (getRightChild(i) < size) {
                System.out.print("Right child: " + heap[getRightChild(i)]);
            }
        }
    }

    public boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int current, int parent) {
        int temp = heap[current];
        heap[current] = heap[parent];
        heap[parent] = temp;
    }

}
