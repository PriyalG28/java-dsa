package jan12;

import java.util.ArrayList;

public class RecursionIV {

    // Count total paths to move from (0,0) in a maze to (n,m)
    public static int countPaths(int i, int j, int n, int m) {

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        if (i == n || j == m) {
            return 0;
        }


        int downPaths = countPaths(i, j + 1, n, m);
        int rightPaths = countPaths(i + 1, j, n, m);
        return downPaths + rightPaths;
    }

    // Count total ways in which we can place a tile of size 1xm in a floor of size nxm
    public static int totalWays(int n, int m) {
        if (n == m) return 2;
        if (n < m) return 1;

        int verticalPlacements = totalWays(n - 1, m);
        int horizontalPlacements = totalWays(n - m, m);
        return verticalPlacements + horizontalPlacements;
    }


    // Find total no. of ways in which guests can be called to a party either single or in pair where n = total no. of guests
    public static int callGuests(int n) {
        if (n <= 1) return 1;
        int way1 = callGuests(n - 1);
        int way2 = (n - 1) * callGuests(n - 2);
        return way1 + way2;
    }

    // Print all subsets of first n natural numbers : Time Complexity(O(2^n))
    public static void findSubsets(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubsets(subset);
            return;
        }
        subset.add(n);
        findSubsets(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void printSubsets(ArrayList<Integer> subset) {
        for (Integer integer : subset) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int totalPaths = countPaths(0, 0, 3, 3);
        int totalWays = totalWays(4, 2);
        int totalCallGuest = callGuests(4);
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(3, subset);
//        System.out.println(totalCallGuest);
    }
}
