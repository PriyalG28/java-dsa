package feb22;

import java.util.Arrays;

public class BinarySearch2D {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 110, 120, 130}
        };
        System.out.println(Arrays.toString(searchInSortedArray(arr, 60)));
    }

    // Ques: Find a target in a sorted array
    // Ex: {{10,20,30},
    //      {43,45,65},
    //      {27,28,29}}
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};

    }

    // Ques: Find a target in a sorted array
    // Ex: {{1,2,3},
    //      {4,5,6},
    //      {7,8,9}}

    static int[] searchInSortedArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious here matrix can be empty
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }
            if (matrix[mid][midCol] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the cols of 2 rows
        if (matrix[rStart][midCol] == target) {
            return new int[]{rStart, midCol};
        }
        if (matrix[rStart + 1][midCol] == target) {
            return new int[]{rStart + 1, midCol};
        }

        //search in 1st half
        if (target <= matrix[rStart][midCol - 1]) {
            return binarySearch(matrix, rStart, 0, midCol - 1, target);
        }
        //search in 2nd half
        if (target >= matrix[rStart][midCol + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, midCol + 1, cols - 1, target);
        }
        //search in 3rd half
        if (target <= matrix[rStart + 1][midCol - 1]) {
            return binarySearch(matrix, rStart + 1, 0, midCol - 1, target);
        }
        //search in 4th half
        else {
            return binarySearch(matrix, rStart + 1, midCol + 1, cols - 1, target);
        }

    }

    // Simple BS on matrix
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

}
