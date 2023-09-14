package aug5;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = "Priyal";
////        Scanner sc = new Scanner(System.in);
//
//        //Concatenation
//        String firstName = "Priyal";
//        String lastName = "Gupta";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

        //Length of a String
//        System.out.println("Length of String is: " + fullName.length());

        //charAt
//        for (int  i = 0; i < fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }

        // Comparison of Strings

//        String name1 = "PriyalG";
//        String name2 = "PriyalH";
//        if (name1.compareTo(name2) == 0){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }

        //Substrings
//        String sentence = "Hi my name is priyal gupta 134567";
//        String sentence1 = "134567";
//        String differentName = sentence.substring(11);
//
//        //Parse String Method
//        int num = Integer.parseInt(sentence1);
//        System.out.println(num);

        // ToString Method of Integer Class
//        int num =  1234;
//        String str = Integer.toString(num);
//        System.out.println(str.length());

        //Strings are immutable

        // Length of cumulative Strings
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Size of an Array: ");
//        int size = sc.nextInt();
//        String[] stringArray = new String[size];
//        for (int i = 0; i < stringArray.length; i++){
//            stringArray[i] = sc.next();
//        }
//        String commonString = "";
//        for (int i = 0; i < stringArray.length; i++){
//            commonString += stringArray[i];
//        }

//        //Second Approach
//        int totalLength = 0;
//        for (int i = 0; i < stringArray.length; i++){
//            stringArray[i] = sc.next();
//            totalLength += stringArray[i].length();
//        }
//        System.out.println("cumulative length of the string is: " + totalLength);
////        System.out.println("cumulative length of the string is: " + commonString.length());


        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        // Replace strings

//        String result  = "";
//
//        for (int i = 0; i < inputString.length(); i++){
//            if(inputString.charAt(i) == 'e'){
//                result += 'i';
//            }else{
//                result += inputString.charAt(i);
//            }
//        }
//        System.out.println("Result is: " + result);

        // Creating username

        int index = inputString.indexOf('@');
        String username = inputString.substring(0,index);

        System.out.println("Username is: " + username);

    }
}
