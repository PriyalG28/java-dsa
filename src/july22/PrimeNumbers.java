package july22;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isNotaPrime = false;
        if (num > 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isNotaPrime = true;
                    break;

                }
            }
        }
        if (isNotaPrime)
            System.out.println("It's not a Prime Number");
        else
            System.out.println("It's a Prime Number");

    }
}
