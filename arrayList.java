
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Please enter the city numbers (enter -1 to stop):");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            list.add(sc.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("City number " + (i + 1) + ": " + list.get(i));
        }
    }

}
