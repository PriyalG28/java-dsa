package july22;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Enter columns: ");
//        int columns = sc.nextInt();

        //Solid Rectangle
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < columns; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Hollow Rectangle
//        for (int i = 1; i <= rows; i++){
//            for(int j = 1; j <= columns; j++){
//                if (i == 1 || i == rows || j == 1 || j == columns)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        //Half Pyramid
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Inverted Half Pyramid
//        for(int i = n; i > 0; i--){
//            for(int j = i; j > 0; j--)
//                System.out.print("*");
//            System.out.println();
//        }

        // Inverted Half Pyramid (rotated by 180 deg)
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Half Pyramid with Numbers
//        for(int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Inverted Half Pyramid with Numbers
//        for (int i = n; i > 0; i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Floyd's Triangle
//        int counter = 1;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(counter++  + " ");
//            }
//            System.out.println();
//        }

        //0-1 Triangle
        int number = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }








    }
}
