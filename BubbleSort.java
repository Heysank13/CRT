
public class BubbleSort {

    public static void bubble(int arr[]) {
        int swap = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass: " + (i + 1) + "\n");
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swapped between " + arr[j] + " with " + arr[j + 1] + "\n");
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    for (int a : arr) {
                        System.out.print(a + " ");

                    }
                    System.out.println();

                }
            }
        }
        System.out.println("No. of Swapped perform is: " + swap);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 7, 9, 2, 4, 6 };
        bubble(arr);

        System.out.println("Final sorted array");
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }

}
