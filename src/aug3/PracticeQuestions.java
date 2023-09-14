package aug3;

import java.util.Scanner;

public class PracticeQuestions {

    public static void printAverage(int a, int b, int c) {
        System.out.println("Average is: " + (a + b + c / 3.0));
    }

    public static void printSumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void printGreaterNumber(int a, int b) {
        if (a == b)
            return;
        if (a > b)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(b + " is greater than " + a);
    }

    public static double calculateCircumference(int radius) {
        return 2 * 3.14 * radius;
    }

    public static void printEligibility(int age) {
        if (age > 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Ineligible to vote");
    }

    public static void calculatePower(int num, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println(num + " raised to the power of " + power + " is: " + result);
    }
    public static void printGcd(int a, int b) {
        if (a == b)
            System.out.println("GCD is: " + a);
        else if (a > b) {
            if (a % b == 0) {
                System.out.println("GCD is: " + b);
            } else {
                printGcd(a - b, b);
            }
        }else{
            if (b % a == 0) {
                System.out.println("GCD is: " + a);
            } else {
                printGcd(a, b-a);
            }
        }

    }
    public static void printFibonacci(int n) {
        if( n == 1){
            System.out.println("0");
        }else if( n == 2){
            System.out.println("0 1");
        }else{
            System.out.print("0 ");
            int sum = 1;
            int previous_int = 1;
            int next_int = 0;
            for (int i = 1; i < n; i++){
                sum = previous_int + next_int;
                previous_int = next_int;
                next_int = sum;
                System.out.print(sum + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
//        int num ;
//        int zeroes = 0;
//        int positives = 0;
//        int negatives = 0;
//
//        do{
//            num = sc.nextInt();
//            if(num == 0)
//                zeroes ++;
//            else if (num > 0)
//                positives ++;
//            else
//                negatives ++;
//
//        }
//        while (sc.hasNextInt());
//        System.out.println("Positives: " + positives + "\nnegatives: " + negatives + "\n zeroes: " + zeroes);


    }
}
