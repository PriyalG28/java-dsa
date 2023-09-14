package july24;

import java.util.Scanner;

public class PatternsAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Solid Rhombus
//        for (int i = 0; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
        //Number Pyramid
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
