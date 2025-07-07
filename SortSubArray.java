import java.util.Scanner;

public class SortSubArray {

    public static void bubble(int arr[]) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 7, 9, 2, 4, 6 };
        System.out.println("Enter the start:");
        int start = sc.nextInt();


        bubble(arr);

        System.out.println("Final sorted array");
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }

}


