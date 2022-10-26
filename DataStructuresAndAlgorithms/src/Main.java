import datastructures.CustomLinkedList;
import datastructures.CustomStack;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(-1212123);
        stack.push(-4);
        stack.push(124);

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }


}