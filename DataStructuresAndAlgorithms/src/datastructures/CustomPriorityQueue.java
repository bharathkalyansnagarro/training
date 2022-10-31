package datastructures;

import java.util.*;

public  class CustomPriorityQueue {
    ArrayList< Integer> heap;

    public CustomPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void add(int val) {
        heap.add(val);
        upHeapify(heap.size() - 1);
    }

    private void upHeapify(int i) {
        if (i == 0) {
            return;
        }

        int pi = (i - 1) / 2;
        if (heap.get(pi) > heap.get(i)) {
            swap(i, pi);
            upHeapify(pi);
        }
    }

    private void swap(int i, int j) {
        int ith = heap.get(i);
        int jth = heap.get(j);
        heap.set(i, jth);
        heap.set(j, ith);
    }

    public int remove() {
        if (this.size() == 0) {
            System.out.println("Underflow");
            return -1;
        }
        swap(0, heap.size() - 1);
        int val = heap.remove(heap.size() - 1);
        downHeapify(0);
        return val;
    }

    private void downHeapify (int index) {
        int largestIndex = index;

        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex < heap.size() && heap.get(leftChildIndex) > heap.get(largestIndex)) {
            largestIndex = leftChildIndex;
        }
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(largestIndex)) {
            largestIndex = rightChildIndex;
        }
        if (largestIndex != index) {
            swap(index, largestIndex);
            downHeapify(largestIndex);
        }
    }

    public int peek() {
        if (this.size() == 0) {
            System.out.println("Underflow");
            return -1;
        }

        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }
}
