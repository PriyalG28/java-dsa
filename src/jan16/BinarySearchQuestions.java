package jan16;


import java.util.Arrays;

public class BinarySearchQuestions {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 9, 10, 11, 35, 41, 42, 46, 67, 76, 77, 78, 89, 99, 798, 7654, 34355, 53221};
        int[] arr1 = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(arr1));
    }

    // Ques: Find ceiling value from an array for the given target
    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Ques: Find floor value from an array for the given target
    static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 744. Find Smallest Letter Greater Than Target (LC)
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 34. Find First and Last Position of Element in Sorted Array (LC)
    static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = findRange(nums, target, true);
        if (res[0] != -1) {
            res[1] = findRange(nums, target, false);
        }
        return res;
    }

    static int findRange(int[] nums, int target, boolean firstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        // find first position of the target
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Ques: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    // Approach use: Sliding window + BS
    static int findIndex(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 852. Peak Index in a Mountain Array (LC) <-> 162
    static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Ques: 1095. Find in Mountain Array
    public int findInMountainArray(int target, int[] mountainArr) {
        int peakIndex = peakIndexInMountainArray(mountainArr);
        if (target < mountainArr[peakIndex]) {
            return binarySearch(mountainArr, target, 0, peakIndex);
        } else {
            return binarySearch(mountainArr, target, peakIndex, mountainArr.length - 1);
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 33. Search in Rotated Sorted Array (Better approach to do this is recursion)
    static int searchInPivot(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] > target) {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        return binarySearch(nums, target, 0, pivot - 1);
    }

    // This does not work in case of duplicate numbers
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] >= nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            } else if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 153. Find Minimum in Rotated Sorted Array <-> Ques.154 (duplicate elements)
    static int findMin(int[] nums) {

        if (nums.length < 2) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);

        int pivot = findPivot(nums);
        if (pivot == -1) {
            return nums[0];
        }
        return Math.min(nums[0], nums[pivot + 1]);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Ques: 81. Search in Rotated Sorted Array II
    static boolean searchInRotatedArray(int[] nums, int target) {
        int pivot = findPivotForDuplicateNumbers(nums);
        System.out.println(pivot);

        if (pivot == -1) {
            return binarySearchInRotatedArray(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) return true;
        if (nums[0] > target) {
            if (nums.length - pivot == 2) {
                return (nums[nums.length - 1] == target);
            } else {
                return binarySearchInRotatedArray(nums, target, pivot + 1, nums.length - 1);
            }
        } else return binarySearchInRotatedArray(nums, target, 0, pivot - 1);
    }

    static boolean binarySearchInRotatedArray(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    // For duplicate numbers
    static int findPivotForDuplicateNumbers(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] == nums[start]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
            } else if (nums[mid] == nums[end]) {
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] > nums[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array
    // Approach 1: Find Pivot and ans = pivot + 1;
    // Approach 2: Find minimum in rotated array using BS

    // Approach 1:
    static int rotationCount(int[] nums) {
        return findPivot(nums) + 1;
    }

    // Approach 2:
    static int rotationCount2(int[] nums) {
        return findPivot(nums) + 1;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 540. Single Element in a Sorted Array
    // If mid is even, the single element must be on the right end else it will be in left part
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 2;
            }

        }
        return nums[start];
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 287. Find the Duplicate Number
    static int findDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int count = 0;
        Arrays.sort(nums);

        while (start < end) {
            int mid = start + (end - start) / 2;
            for (int num : nums) {
                if (num <= mid)
                    count++;
            }
            if (count > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Ques: 410. Split Array Largest Sum
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }
        while(start < end){

            //Consider mid as a potential answer
            int mid = start + (end - start) / 2;

            //Calculate the no. of pieces we can divide the array in where mid is the max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // we cannot add this in this subarray, make new one
                    // say we add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }

        }
        return start;
    }

}
