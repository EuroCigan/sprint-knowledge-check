import java.util.Arrays;

public class InsertSort {
    public int[] main(String[] args) {
        int [] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        for (int i = 1; i < arr.length; i++){
            int actual = arr[i];
            int j = i;
            while (j > 0 && arr[j -1] > actual) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = actual;
        }
        return arr;
    }
}
