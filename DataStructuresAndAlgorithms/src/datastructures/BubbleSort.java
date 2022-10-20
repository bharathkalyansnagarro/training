package datastructures;

/*
*
* ALGORITHM : BUBBLE SORT
* TIME COMPLEXITY : O(N^2)
* SPACE COMPLEXITY : O(1)
*
* */
public class BubbleSort {

    public  void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, i, j);
            }
        }
    }

    public  void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private  void swap(int[] array, int i, int j) {
        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

}
