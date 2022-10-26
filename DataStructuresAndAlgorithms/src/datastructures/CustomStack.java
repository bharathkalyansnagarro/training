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
public class CustomStack implements Iterable<Integer> {

    private int size;
    private final int capacity;
    private final List<Integer> stack;

    public CustomStack() {
        this.size = 0;
        this.capacity = 10;
        this.stack = new LinkedList<>();
    }

    public CustomStack(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.stack = new LinkedList<>();
    }


    public void push(int value) {
        if (size == capacity) throw new StackOverflowError();
        stack.add(0, value);
        size++;
    }

    public int pop() {
        if (size == 0) throw new EmptyStackException();
        size--;
        return stack.remove(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        else return stack.get(0);
    }

    public int getSize() {
        return this.size;
    }

    public int getCenter() {
        if (size == 0) return -1;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size / 2; i++)
            s.push(stack.remove(0));
        int result = stack.get(0);

        while (!s.isEmpty())
            stack.add(0, s.pop());

        return result;
    }

    public void reverseStack() {
        if (this.stack.size() == 0) return;
        int poppedElement = this.stack.remove(0);
        reverseStack();
        stack.add(poppedElement);
    }


    public boolean contains(int element) {
        for (int i = 0; i < size; i++)
            if (stack.get(i) == element)
                return true;

        return false;
    }

    public void sortStack() {
        if (this.stack.size() > 0) {
            int poppedElement = this.stack.remove(0);
            sortStack();
            sortInserted(this.stack, poppedElement);
        }
    }

    private void sortInserted(List<Integer> stack, int poppedElement) {
        if (stack.size() == 0 || stack.get(0) < poppedElement) {
            stack.add(0, poppedElement);
            return;
        }

        int element = stack.remove(0);
        sortInserted(stack, poppedElement);
        stack.add(0, element);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(stack.get(i));
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && stack.get(currentIndex) != null;
            }

            @Override
            public Integer next() {
                return stack.get(currentIndex++);
            }


        };
    }
}



































