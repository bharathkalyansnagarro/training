package datastructures;

import java.util.Iterator;

/*
• Insert !
• Insert at position !
• Delete !
• Delete at position !
• Center !
• Sort !
• Reverse !
• Size !
• Iterator !
• Traverse/Print !
* */
public class CustomLinkedList<T> implements Iterable<T> {

    private int size = 0;
    private CustomNode<T> head, tail;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        CustomNode<T> node = new CustomNode<T>(value);
        if (tail == null) {
            head = tail = node;
        }
        tail.next = node;
        tail = tail.next;
        size++;
    }

    public void add(int position, T value) {
        if (this.head == null) {
            add(value);
            return;
        }
        CustomNode<T> node = new CustomNode<T>(value);
        if (position == 0) {
            node.next = this.head;
            this.head = node;
            size++;
            return;
        }
        if (position >= this.size) {
            tail.next = node;
            tail = tail.next;
            size++;
        } else {
            CustomNode<T> temp = this.head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            CustomNode<T> nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
        size++;

    }

    public void delete() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    public void delete(int position) {
        if (head == null || position < 0) return;
        if (position == 0) {
            head = head.next;
            return;
        }
        CustomNode<T> temp = this.head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public CustomNode<T> getCenterNode() {

        CustomNode<T> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public CustomNode<T> reverseList(CustomNode<T> head) {
        return reverseList(head, null);
    }

    private CustomNode<T> reverseList(CustomNode<T> head, CustomNode<T> prev) {
        if (head == null) return prev;
        CustomNode<T> next = head.next;
        head.next = prev;
        return reverseList(next, head);
    }

    public void printList() {
        CustomNode<T> temp = this.head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize() {
        return this.size;
    }

    public CustomNode<T> getHead() {
        return this.head;
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new CustomLinkedListIterator<T>(this);
    }
}

class CustomLinkedListIterator<T> implements Iterator<CustomNode<T>> {

    CustomNode<T> current;

    public CustomLinkedListIterator(CustomLinkedList<T> list) {
        current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public CustomNode<T> next() {
        T temp = current.getValue();
        current = current.next;
        return (CustomNode<T>) temp;
    }
}
