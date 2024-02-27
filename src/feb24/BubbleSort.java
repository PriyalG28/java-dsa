package feb24;

import java.util.Arrays;

public class BubbleSort {

    // With the first pass through the array, the largest element came to the last index of array
    // With the second pass, the second last element will come to the second last index and so on
    // Bubble Sort is also known as Sinking Sort or Exchange Sort
    // Space Complexity: O(1) //no extra space req
    // This is an inplace sorting algorithm
    // Time Complexity: best case O(n)
    // Time Complexity: worst case O(n^2)
    // It's a stable sorting algorithm i.e., when the original order is maintained for the array, when two or more values are same then it's a stable algorithm.


    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 2, 6, 8, 83, 2, 53, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // run the steps n-1 times

        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;

            // for each step the max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {

                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;

                }
            }
            if (!swap) {
                break;
            }

        }
    }


}
