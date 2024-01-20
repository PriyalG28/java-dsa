package jan15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {

    // Print all 3 digit armstrong number
    public static boolean isArmstrong(int n){
        int num = n;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        return sum == n;
    }

    // Reversing an array using Swap(2-pointer method)
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        for (int i = start; i< end;){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            i++; end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        for(int i = 100; i < 1000; i++){
//            if(isArmstrong(i))
//                System.out.println(i);
//        }
        int[] a = new int[] {1,2,3,4};
        reverseArray(a);

    }
}
