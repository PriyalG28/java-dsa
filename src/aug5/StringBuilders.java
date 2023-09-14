package aug5;

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
//        System.out.println(sb.charAt(3));

        // Set char at index
//        sb.setCharAt(0, 'P');

        //Insert function
//        sb.insert(2,'n');

        //Delete
//        sb.delete(2,4);

//        // Append
//
//        sb.append('e');
//        sb.append('l');
//        sb.append('l');
//        sb.append('o');
//
//        System.out.println(sb.length());

        //reverse a string

        for (int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);




    }
}
