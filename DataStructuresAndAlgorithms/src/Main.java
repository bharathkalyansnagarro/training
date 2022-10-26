import datastructures.CustomLinkedList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(0, 100);
        list.printList();

    }


}