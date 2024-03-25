package mar18;

public class Patterns {
    public static void main(String[] args) {
        pattern8(5);


    }

    /*
     *****
     *****
     *****
     *****
     *****
     */
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *****
     ****
     ***
     **
     *
     */
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     */
    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
         *
        **
       ***
      ****
     *****
     */
    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *****
      ****
       ***
        **
         *
     */
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
         *
        ***
       *****
      *******
     *********
     */
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */
    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */
    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
