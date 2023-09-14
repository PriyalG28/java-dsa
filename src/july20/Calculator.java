package july20;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter value for b: ");
        int b = sc.nextInt();
        System.out.println("Choose an operation:" +
                "1 : + (Addition) a + b\n" +
                "2 : - (Subtraction) a - b\n" +
                "3 : * (Multiplication) a * b\n" +
                "4 : / (Division) a / b\n" +
                "5 : % (Modulo or remainder) a % b\n");
        int operation = sc.nextInt();
        switch (operation){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
