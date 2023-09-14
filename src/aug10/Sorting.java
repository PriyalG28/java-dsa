package aug10;

public class Sorting {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        //Bubble sort, selection sort, insertion sort

        //1. Bubble Sort

        int[] arr = {7, 8, 3, 1, 2};

        //time complexity = O(n^2)
        //bubble sort
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                }
//            }
//        }

        //Time complexity = O(n^2)
        
        //2. Selection Sort

        int smallest = 0;
        for(int i = 0; i < arr.length - 1; i++){
            smallest = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[smallest]){
                   smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        //Time Complexity = O(n^2)


        //Insertion Sort

        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = current;

        }





        printArray(arr);


    }
}
