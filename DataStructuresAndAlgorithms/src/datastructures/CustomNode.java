package datastructures;


import java.util.Comparator;

public class CustomNode<T> implements Comparable<T> {
    private T value;
    CustomNode<T> next;

    CustomNode() {
    }

    public CustomNode(T value) {
        this.value = value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
