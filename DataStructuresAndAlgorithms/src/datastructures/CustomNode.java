package datastructures;


public class CustomNode<T> {
    private T value;
    CustomNode next;

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


}
