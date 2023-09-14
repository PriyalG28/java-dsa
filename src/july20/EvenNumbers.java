package july20;

import java.util.Scanner;

// Print all even numbers till n
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        do{
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            if(marks >= 90)
                System.out.println("This is Good");
            else if(marks >= 60)
                System.out.println("This is also Good");
            else if(marks > 0)
                System.out.println("This is Good as well");
            else
                break;
        }while(n==1);

    }
}
