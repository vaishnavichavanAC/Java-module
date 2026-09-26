
import java.util.Arrays;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 45, 30, 15};

        // Find smallest number using lambda expression
        int smallest = Arrays.stream(numbers)
                .reduce((a, b) -> a < b ? a : b)
                .getAsInt();

        System.out.println("Smallest number: " + smallest);
    }
}

