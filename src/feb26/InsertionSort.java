package feb26;

import java.util.Arrays;

import static feb26.SelectionSort.swap;

public class InsertionSort {
    // For every index: put that index element at the correct index in LHS(already sorted)
    // with pass 1: sort till index 1; with pass 2: sort till index 2 and so on...
    // When element j !smaller than the element at j-1 break the loop, cz its already sorted
    // Time Complexity: best case O(n)
    // Time Complexity: worst case O(n^2)
    // It's adaptive: steps gets reduced if arr is already sorted
    // No. of swaps reduces as compared to bubble sort
    // It's a stable sorting algorithm
    // Used for smaller value of n; works good if array is partially sorted; this is the reason it takes part in
    // hybrid sorting algorithm

    public static void main(String[] args) {
        int[] arr = {3, 1, 31, 2, 6, 9, 4, 8, 7,};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }


}
