package feb27;

import java.util.ArrayList;
import java.util.List;

public class CycleSort {

    // When given no.s from range 1 to n, use cyclic sort
    // Swap the number with its correct position(n-1)
    // Worst case example: O(N-1) ~ O(N)

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1};
//        cyclicSort(arr);

        System.out.println(missingNum(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (i == arr[i] - 1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques.268 (LC) Missing Number
    static int missingNum(int[] arr) {
        int i = 0;
        int result = -1;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
                result = i;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (k != arr[k]) {
                return k;
            }
        }
        return arr.length;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques.448 (LC) Find All Numbers Disappeared in an Array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            if(nums[k] != k + 1){
                result.add(k + 1);
            }
        }
        return result;

    }

}
