package jan11;

import java.util.HashSet;

public class RecursionIII {


    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};



    // Print all unique subsequences
    public static void subsequences(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr))
                return;
            else {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newStr+currChar, set);

        // not to be
        subsequences(str, idx + 1, newStr, set);
    }

    //Print keypad combination
    public static void printCombinations(String str, int idx, String combination){
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mappingKey = keypad[currChar - '0'];
        for (int i = 0; i < mappingKey.length(); i++){
            printCombinations(str, idx+1, combination + mappingKey.charAt(i));
        }
    }

    // print all permutations
    //Time Complexity = n!
    public static void permutations(String str, String permutations){
        if(str.length() == 0){
            System.out.println(permutations);
            return;
        }

        for (int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, permutations + currChar);
        }
    }

    // Count total paths in a maze to move from (0, 0) to (n, m)
    




    public static void main(String[] args) {
        String str = "abc";
//        HashSet<String> set = new HashSet<>();
//        subsequences(str, 0, "", set);
//        printCombinations(str, 0, "");
        permutations(str, "");

    }

}
