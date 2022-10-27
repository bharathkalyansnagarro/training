import datastructures.CustomHashMap;
import datastructures.CustomQueue;
import datastructures.CustomStack;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        CustomQueue<Integer> q = new CustomQueue<>();
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(-15);
        q.enqueue(19995);
        q.print();
        System.out.println(q.dequeue());
    }


}