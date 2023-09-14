package july20;

import java.util.*;

public class Loops {
    public static void main(String[] args) {
    // Sum of N natural numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int sum = 0;
//        int counter = 1;
//        while (counter <= n){
//            sum += counter;
//            counter++;
//        }
//        System.out.println(sum);


        // Table of a number input by the user
        for (int i = 1; i <= 10; i++){
            System.out.println(i*n);
        }
    }
}
