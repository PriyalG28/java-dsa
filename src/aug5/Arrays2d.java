package aug5;

import java.util.Scanner;

public class Arrays2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
//        System.out.println("Find: ");
//        int x = sc.nextInt();

        //Linear Search
//        for (int i = 0; i < rows; i++){
//            for (int j =0; j < columns; j++){
//                if(numbers[i][j] == x){
//                    System.out.print("row: " + i + "; colummns: " + j);
//                }
//            }
//        }


        // Printing Spiral Matrix Out of a given matrix
//
//        int init_row = 0;
//        int last_row = rows - 1;
//        int init_col = 0;
//        int last_col = columns - 1;
//
//        while(init_row <= last_row && init_col <= last_col) {
//            for (int j = init_col; j <= last_col; j++) {
//                System.out.print(numbers[init_row][j] + " ");
//            }
//
//            init_row++;
//
//            for (int i = init_row; i <= last_row; i++) {
//                System.out.print(numbers[i][last_col] + " ");
//            }
//
//            last_col--;
//
//            for (int j = last_col; j >= init_col; j--) {
//                System.out.print(numbers[last_row][j] + " ");
//            }
//
//            last_row--;
//
//            for (int i = last_row; i >= init_row; i--) {
//                System.out.print(numbers[i][init_col]);
//            }
//
//            init_col++;
//
//        }

//        //Printing Transpose
//
//        int[][] transpose = new int[columns][rows];
//
//        for (int i = 0; i < columns; i++){
//            for (int j = 0; j < rows; j++){
//                transpose[i][j] = numbers[j][i];
//            }
//        }
//        //Printing Transpose[Short Trick]
//
//        for (int i = 0; i < columns; i++){
//            for (int j = 0; j < rows; j++){
//                System.out.print(numbers[j][i] + " ");
//            }
//            System.out.println();
//        }



    }
}


