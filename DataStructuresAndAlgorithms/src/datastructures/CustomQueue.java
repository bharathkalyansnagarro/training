package datastructures;

/*
* Enqueue !
• Dequeue !
• Peek !
• Contains !
• Size !
• Center !
• Sort !
• Reverse !
• Iterator !
• Traverse/Print !
* */

import java.util.Iterator;

public class CustomQueue<T extends Number> {

    private int size;
    private final CustomLinkedList<T> queue;

    public CustomQueue() {
        this.size = 0;
        this.queue = new CustomLinkedList<>();
    }


    public void enqueue(T value) {
        size++;
        queue.add(value);
    }

    public T dequeue() {
        T delete = queue.delete(0);
        if (delete != null) size--;
        return delete;
    }

    public int getSize() {
        return size;
    }

    public void sort() {
        queue.sort();
    }

    public T peek() {
        if (isEmpty()) return null;
        return queue.getHead().getValue();
    }

    public boolean contains(T value) {
        CustomNode<T> temp = queue.getHead();
        while (temp != null) {
            if (temp.getValue() == value) return true;
            temp = temp.next;
        }
        return false;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public T getCenter() {
        CustomNode<T> centerNode = queue.getCenterNode();
        return centerNode.getValue();
    }

    public void reverseQueue() {
        queue.reverse();
    }

    public void print() {
        CustomNode<T> head = queue.getHead();
        while (head != null) {
            System.out.println(head.getValue());
            head = head.next;
        }
    }

    public Iterator<T> iterator() {
        return queue.iterator();
    }

}
