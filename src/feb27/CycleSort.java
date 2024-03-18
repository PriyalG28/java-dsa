package feb27;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CycleSort {

    // When given no.s from range 1 to n, use cyclic sort
    // Swap the number with its correct position(n-1)
    // Worst case example: O(N-1) ~ O(N)

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
//        cyclicSort(arr);

        System.out.println(firstMissingPositive(arr));

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
            if (nums[k] != k + 1) {
                result.add(k + 1);
            }
        }
        return result;

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques.287 (LC) Find the duplicate number
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i] - 1) {
                if (nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i, nums[i] - 1);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return nums.length;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques.442 (LC) Find all duplicates in an array
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctNum = nums[i] - 1;
            if (i != correctNum && nums[i] != nums[correctNum]) {
                swap(nums, i, correctNum);
            } else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                result.add(nums[k]);
            }
        }
        return result;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques.645 (LC) Set Mismatch
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (i != correctIndex && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                return new int[]{nums[k], k + 1};
            }
        }

        return result;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques.41 (LC) First Missing Positive
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                return k + 1;
            }
        }

        return nums.length + 1;
    }

}
