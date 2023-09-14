package aug3;

import java.util.Scanner;

public class FunctionsNMethods {

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Number " + n + " is Prime? " + checkPrime(n));

    }
}
