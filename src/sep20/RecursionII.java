package sep20;

import java.lang.reflect.Array;

public class RecursionII {

    public static int first = -1;
    public static int last = -1;

    public static boolean[] map = new boolean[26];

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public static void printReverseString(String s, int index) {
        if (index == s.length() - 1) {
            System.out.print(s.charAt(index));
            return;
        }
        printReverseString(s, index + 1);
        System.out.print(s.charAt(index));
    }

    public static void occurence(String s, int idx, char c) {
        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = s.charAt(idx);
        if (currentChar == c) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        occurence(s, idx + 1, c);
    }

    public static boolean isArraySorted(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return true;
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return isArraySorted(arr, idx + 1);
    }

    public static void moveAllX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            while (count > 0) {
                newStr += 'x';
                count--;
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newStr);
        } else {
            newStr += currChar;
            moveAllX(str, idx + 1, count, newStr);
        }

    }

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length ==1) {
            return 1;
        }
        if (nums.length ==2) {
            return 2;
        }
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

    }


    public static void main(String[] args) {

        //Question - TOWER OF HANOI
        //There are 3 towers: source, helper and destination
        //Task is to transfer all disks from source to destination
        //Rule 1: Only one disk to be transferred at a time
        //Rule 2: Smaller disks are always kept on top of larger disks
        //Time Complexity: O(2^n -1) ~ O(2^n)

        int n = 3;
        String str = "axbcxxxccdsxdxadwezxsx";

//        towerOfHanoi(n, "S", "H", "D");

        //Question - Print a string in reverse
        //Time Complexity - O(n) n->String Length
//        printReverseString(s, 0);

        //Question - Find first and last occurrence of an element in a string
        //Time Complexity - O(n)
//        occurence(s, 0, 'a');

        //Question - Check if an array is sorted
        //Time Complexity - O(n)
//        int[] arr = new int[]{1,2,3,5,782,90,190};
//        System.out.println(isArraySorted(arr, 0));

        //Question - Move all 'x' to the back of the string
        //Time complexity: O(n + count) = O(2n) ~ O(n)
//        moveAllX(str, 0, 0, "");

        //Question - Remove Duplicates
        //Time Complexity = O(n)
//        removeDuplicates(str, 0, "");

        //Print all the subsequences of a string

        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4};

        int count = removeDuplicates(arr);
        System.out.println("original length: " + arr.length);
        System.out.println("new length: " + count);

    }
}
