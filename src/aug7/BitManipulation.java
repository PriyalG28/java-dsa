package aug7;

import java.util.Scanner;

public class BitManipulation {

    public static void decimalToBinary(int n) {
        int result = 0;
        int bitMask;
        //Method 1:Using Bitwise operators
//        for (int i = 31; i >= 0; i--){
//            bitMask = n>>i;
//            if ((bitMask & 1) == 1) {
//                System.out.print("1");
//            } else {
//                System.out.print("0");
//            }
//        }

        //Method 2: Using arrays
        int[] numbers = new int[1000];
        int i = 0;
        while (n > 0) {
            numbers[i] = n % 2;
            n /= 2;
            i++;
        }

        for (i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }

    }

    public static void binaryToDecimal(int n) {
        int number = 0;
        int i = 0;
        while (n > 0) {
            System.out.println(n%10);
            number += n%10 * calculatePower(2, i);
            n /= 10;
            i++;
        }

        System.out.println("Decimal is : " + number);
    }

    public static int calculatePower(int n, int i) {
        int power = 1;
        if (i == 0) {
            return power;
        }

        while (i > 0) {
            power *= n;
            i--;
        }
        return power;

    }

    public static void main(String[] args) {

        // Get Bit
        //1. BitMask: 1<<i
        //2. Operation: AND
//        int n = 5; // 0101
//        int pos = 2;
//        int bitMask = 1<<pos;
//        if ((bitMask & n) == 0){
//            System.out.println("Bit was zero");
//        }else {
//            System.out.println("Bit was one");
//        }

        // Set Bit
        //1.Bit Mask: 1<<pos
        //2. operation: OR

//        int newNumber = bitMask | n;
//            System.out.println("Bit was setted: New number: " + newNumber);

        //Clear Bit
        //1.Bit Mask: 1<<pos
        //2.Operation: AND with NOT
//        int notBitMask = ~(bitMask);
//        int newNumber =  notBitMask & n;
//        System.out.println("Clear bit at given position, number becomes: " + newNumber);

        //Update Bit
        //1.For 1:
        //1a. Bit Mask: 1<<i
        //1b. Op: AND with NOT (CLEAR BIT LOGIC)

        //2.For 0:
        //2a. Bit Mask: 1<<i
        //2b. Op: OR(SET BIT LOGIC)
//        Scanner sc = new Scanner(System.in);
//        int oper = sc.nextInt();
//        int n = 5; //1010
//        int pos = 1;
//        int bitMask = 1<<pos;
//        int newNum = 0;
//
//        if(oper == 1){
//            newNum = ~(bitMask) & n;
//        }else{
//            newNum = bitMask | n;
//        }
//        System.out.println(newNum);

        //Q1. find if a number is power of 2 or not
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int dec = num -1;
//        if((dec & 1) == 1)
//            System.out.println("The number is in power of 2");
//        else
//            System.out.println("Not a power of 2");

        //Q2. wap to toggle a bit at position ="pos" in a number "n"

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int pos = sc.nextInt();
//        int bitMask = 1<<pos;
//        int newNum = 0;
//        if((bitMask & n) == 0){
//             newNum = bitMask | n;
//        }else{
//             newNum = bitMask^n;
//        }
//        System.out.println("New number is: " + newNum);

        //Q3. Count no. of 1s in binary representation of a number
//        int counter = 0;
//        while (n > 0){
//            if((n&1) == 1)
//                counter++;
//            n >>= 1;
//        }
        System.out.println("Binary of 8: ");
//        decimalToBinary(8);
        binaryToDecimal(100000);


    }
}
