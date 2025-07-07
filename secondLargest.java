import java.util.Arrays;

public class secondLargest {

    public static void main(String args[]) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element is " + second);
        }
    }

}
