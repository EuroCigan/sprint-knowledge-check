import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSorted bubbleSorted = new BubbleSorted();
        int [] array = bubbleSorted.main(args);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println(" ");

        InsertSort insertSort = new InsertSort();
        int [] arr = insertSort.main(args);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}