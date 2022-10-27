import datastructures.CustomStack;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(-1212123);
        stack.push(-4);
        stack.push(124);
        stack.print();

    }


}