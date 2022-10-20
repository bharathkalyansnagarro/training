package datastructures;


public class SortingAlgorithms {

    /*
     *
     * ALGORITHM : BUBBLE SORT
     * TIME COMPLEXITY : O(N^2)
     * SPACE COMPLEXITY : O(1)
     *
     * */
    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, i, j);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    /*
     *
     * ALGORITHM : SELECTION SORT
     * TIME COMPLEXITY : O(N^2)
     * SPACE COMPLEXITY : O(1)
     *
     * */
    public void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    array[minIndex] = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }


}
