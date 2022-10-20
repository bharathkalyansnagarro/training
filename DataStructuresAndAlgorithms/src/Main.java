import datastructures.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 5, 4, 3, -1, 0};
        SortingAlgorithms.insertionSort(array);
        SortingAlgorithms.printArray(array);
    }


}