package feb26;

import java.util.Arrays;

public class SelectionSort {
    // Swapped with correct index
    // With every pass, the biggest element is going to the last
    // Time Complexity: best case O(n^2): cz anyway its finding the largest element in array
    // Time Complexity: worst case O(n^2)
    // It's an unstable sorting algorithm
    // It performs well on small lists/arrays

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 5, 7, 2, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
