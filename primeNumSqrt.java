//n log(log n) time complexity
public class primeNumSqrt {

    static void isPrime(int n, boolean[] numbers) {

        for (int i = 2; i * i <= n; i++) {
            if (!numbers[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    numbers[j] = true;

                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!numbers[i]) {
                System.out.println(i + " ");
            }
        }

    }

    public static void main(String args[]) {
        int n = 40;
        boolean[] numbers = new boolean[n + 1];

        isPrime(n, numbers);

    }

}
