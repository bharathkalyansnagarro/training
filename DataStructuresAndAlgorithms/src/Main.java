import datastructures.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, -1, 11, 0, 9, 8, 1, 1, 1, 1, -1, 1};
        SortingAlgorithms.quickSort(array);
        SortingAlgorithms.printArray(array);
    }


}