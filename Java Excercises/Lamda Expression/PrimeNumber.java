
import java.util.Scanner;
import java.util.function.Predicate;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Lambda expression to check prime number
        Predicate<Integer> isPrime = (n) -> {

            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };

        // Apply Lambda
        boolean result = isPrime.test(number);

        if (result) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }

        sc.close();
    }
}

