package july14;

import java.util.Scanner;

public class MarksToPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 5: ");
        float sub5 = sc.nextFloat();

        float totalMarks = 500;
        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5)/totalMarks) * 100;
        System.out.println("Your class 12th percentage is: " + percentage);

    }
}
