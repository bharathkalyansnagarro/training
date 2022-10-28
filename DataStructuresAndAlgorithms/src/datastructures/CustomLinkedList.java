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
public class CustomLinkedList<T extends Number> implements Iterable<T> {

    private int size;
    private CustomNode<T> head;
    private CustomNode<T> tail;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        CustomNode<T> node = new CustomNode<>(value);
        if (head == null) {
            head = tail = node;
            size++;
            return;
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
        if (position > this.size) {
            tail.next = node;
            tail = tail.next;
        } else {
            CustomNode<T> temp = this.head;
            for (int i = 0; i < position && temp != null; i++) {
                temp = temp.next;
            }
            CustomNode<T> nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
        size++;

    }

    public T delete() {
        if (head == null) return null;
        CustomNode<T> temp = head;
        head = head.next;
        size--;
        return temp.getValue();

    }

    public T delete(int position) {
        if (head == null || position < 0) return null;
        if (position == 0) {
            return delete();
        }
        CustomNode<T> temp = this.head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        CustomNode<T> result = temp.next;
        temp.next = temp.next.next;
        size--;
        return result.getValue();
    }

    public CustomNode<T> getCenterNode() {

        CustomNode<T> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reverse() {
        this.head = reverse(this.head, null);
    }

    private CustomNode<T> reverse(CustomNode<T> head, CustomNode<T> prev) {
        if (head == null) return prev;
        CustomNode<T> next = head.next;
        head.next = prev;
        return reverse(next, head);
    }

    public void print() {
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

        return new Iterator<T>() {

            CustomNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T temp = current.getValue();
                current = current.next;
                return (T) temp;
            }
        };
    }

    public void sort() {
        head = mergeSort(head);
    }

    private CustomNode<T> mergeSort(CustomNode<T> head) {
        if (head == null || head.next == null) return head;

        CustomNode<T> middleNode = getMiddleNode(head);
        CustomNode<T> nextOfMiddleNode = middleNode.next;
        middleNode.next = null;

        CustomNode<T> leftPart = mergeSort(head);
        CustomNode<T> rightPart = mergeSort(nextOfMiddleNode);
        return mergeTwoSortedLists(leftPart, rightPart);
    }

    //TODO :
    private CustomNode<T> mergeTwoSortedLists(CustomNode<T> leftPart, CustomNode<T> rightPart) {
        if (leftPart == null) return rightPart;
        else if (rightPart == null) return leftPart;
        CustomNode<T> temp = null;

        if (leftPart.getValue().intValue() <= rightPart.getValue().intValue()) {
            temp = leftPart;
            temp.next = mergeTwoSortedLists(leftPart.next, rightPart);
        } else {
            temp = rightPart;
            temp.next = mergeTwoSortedLists(leftPart, rightPart.next);

        }

        return temp;
    }

    private CustomNode<T> getMiddleNode(CustomNode<T> head) {
        if (this.head == null) return null;
        CustomNode<T> slow = head;
        CustomNode<T> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
