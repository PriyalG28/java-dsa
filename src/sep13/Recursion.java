package sep13;

public class Recursion {
    public static void printNumbers(int n) {
        if(n == 6)
            return;
        System.out.println(n);
        printNumbers(n+1);
    }
    private static void printSequence(double n){
        if((int)n == 1){

            return;
        }
        if((int)n%2 == 0){
            System.out.print((int)n + " ");
            n = Math.pow((int)n, 0.5);
            printSequence(n);
        }else{
            System.out.print((int)n + " ");
            n = Math.pow((int)n, 1.5);
            printSequence(n);
        }
    }
    //Sum of first n natural numbers
    public static void printSum(int i, int n, int sum) {
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);

    }

    public static void main(String[] args) {
        int n = 1;
//        printNumbers(1);
//        printSum(1,1,1);
        printSequence(5);
    }


}
