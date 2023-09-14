package july29;

import java.util.Scanner;

public class AdvancePatterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        //Butterfly Pattern
//
//        // Upper Half
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//
//            int spaces = 2 * (n - i);
//            for (int j = 1; j <= spaces; j++){
//                System.out.print(" " );
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Lower Half
//        for (int i = n; i > 0; i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            int spaces = 2 * (n - i);
//
//            for (int j = 1; j <= spaces; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Solid Rhombus

//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n - i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        // Number Pyramid
//
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // Palindromic Pattern

//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = i; j > 0; j--){
//                System.out.print(j);
//            }
//            for (int j = 2; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Diamond Pattern
//
//        for (int i = 0; i < n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i + 1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n-2; i >= 0; i--){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i + 1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Hollow Butterfly

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j > 1 && j < i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            int spaces = 2 * (n - i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if (j > 1 && j < i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = n; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                if (j > 1 && j < i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            int spaces = 2 * (n - i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if (j > 1 && j < i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }

        // Hollow Rhombus

//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++){
//                if (j == 1 || j == n || i == 1 || i == n)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


        // Pascal's Triangle

        int previousSum = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("1 ");
                else {
                    previousSum = i + j;
                    System.out.print(previousSum + " ");
                }
            }
            System.out.println();
        }

    }
}
