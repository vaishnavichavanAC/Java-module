
import java.util.function.Supplier;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        // Lambda expression
        Supplier<Integer> generateNumber =
                () -> 100 + random.nextInt(900);

        // Generate random 3-digit number
        int number = generateNumber.get();

        System.out.println("Random 3-digit number: " + number);
    }
}

