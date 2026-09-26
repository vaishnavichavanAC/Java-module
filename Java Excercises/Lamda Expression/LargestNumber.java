
import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 45, 30, 15};

        // Find largest number using lambda expression
        int largest = Arrays.stream(numbers)
                .reduce((a, b) -> a > b ? a : b)
                .getAsInt();

        System.out.println("Largest number: " + largest);
    }
}
