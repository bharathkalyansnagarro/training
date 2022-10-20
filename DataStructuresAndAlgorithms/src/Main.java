import datastructures.BubbleSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 5, 4, 3};
        BubbleSort object = new BubbleSort();
        object.sort(array);
        object.printArray(array);
    }


}