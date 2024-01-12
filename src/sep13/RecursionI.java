package sep13;

public class RecursionI {
    public static void printNumbers(int n) {
        if(n == 6)
            return;
        System.out.println(n);
        printNumbers(n+1);
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
        System.out.println(i);

    }

    public static int printFactorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * printFactorial(n-1);
    }

    public static void printFibonacci(int a, int b, int n){
        if (n == 0)
            return;
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }

    public static int xToPowOfN(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0)
            return 0;
        x *= xToPowOfN(x, n-1);
        return x;
    }

    public static int calcPower(int x, int n){
        if(n == 0)
            return 1;
        if(x == 0)
            return 0;

        //If n is even
        if(n % 2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
//        printNumbers(1);
//        printSum(1, 10, 0);
//        System.out.println(printFactorial(n));
//        System.out.println(a);
//        System.out.println(b);
//        printFibonacci(a, b, n - 2);
//        System.out.println(xToPowOfN(0, 10));

        // Question: Print x^n with stack height of log n
        System.out.println(calcPower(2, 5));
    }



}
