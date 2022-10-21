import datastructures.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, -1, 11, 0, 9, 8, 1000000, -1121212};
        SortingAlgorithms.heapSort(array);
        SortingAlgorithms.printArray(array);
    }


}