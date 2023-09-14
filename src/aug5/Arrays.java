package aug5;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++){
           numbers[i] = sc.nextInt();
        }
//        System.out.println("Enter the number you want to search:");
//        int num = sc.nextInt();


        //Linear Search
//        for (int i = 0 ; i < numbers.length; i++){
//            if(num == numbers[i]){
//                System.out.println("Index is: " + i);
//                break;
//            }
//        }

        // Find max and min number in array of integers
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < numbers.length; i++){
//            if(numbers[i] < min){
//                min = numbers[i];
//            }
//            if(numbers[i] > max){
//                max = numbers[i];
//            }
//        }
//        System.out.println("Max value: " + max);
//        System.out.println("Min value: " + min);

        // Check if a given array is sorted or not
        int temp = Integer.MIN_VALUE;
        boolean isAsc = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > temp)
                temp = numbers[i];
            else {
                isAsc = false;
            }
        }
        if(isAsc)
            System.out.println("Array is Asc Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}
