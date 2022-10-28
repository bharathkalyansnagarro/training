package datastructures;

import java.util.*;

/*
• Push !
• Pop !
• Peek !
• Contains !
• Size !
• Center !
• Sort !
• Reverse !
• Iterator !
• Traverse/Print !
*  */
public class CustomStack<T extends Number> {

    private int size;
    private final int capacity;

    private final CustomLinkedList<T> stack;

    public CustomStack() {
        this.size = 0;
        this.capacity = 10;
        this.stack = new CustomLinkedList<>();

    }

    public CustomStack(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.stack = new CustomLinkedList<>();

    }


    public void push(T value) {
        if (size == capacity) throw new StackOverflowError();
        stack.add(0, value);
        size++;
    }

    public int pop() {
        if (size == 0) return -1;
        size--;
        return stack.delete(0).intValue();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        else return stack.getHead().getValue();
    }

    public int getSize() {
        return this.size;
    }

    public T getCenter() {
        if (size == 0) return null;
        return stack.getCenterNode().getValue();
    }

    public void reverseStack() {
        if (this.size == 0) return;
        stack.reverse();
    }


    public boolean contains(T element) {
        CustomNode<T> temp = stack.getHead();
        while (temp != null) {
            if (temp.getValue() == element) return true;
            temp = temp.next;
        }
        return false;
    }

    public void sort() {
        stack.sort();
    }


    public void print() {
        CustomNode<T> temp = this.stack.getHead();
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.next;
        }
        System.out.println();
    }


    public Iterator<T> iterator() {
        return stack.iterator();
    }
}
































