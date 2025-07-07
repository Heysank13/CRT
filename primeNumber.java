
public class primeNumber {

    public static void main(String args[]) {
        int n = 10;
        int count = 0;

        for (int i = 1; i < Math.sqrt(n); i++) {

            if (n % i == 0) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

}
