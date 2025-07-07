import java.util.Arrays;
import java.util.Collections;

public class reverseArray {

    public static void main(String[] args) {
        Integer arr[] = { 1, 3, 5, 6, 8, 3, 9, 7 };

        Collections.reverse(Arrays.asList(arr));

        // int start = 0;
        // int end = arr.length - 1;
        //
        // while (start < end) {
        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;
        // start++;
        // end--;
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
