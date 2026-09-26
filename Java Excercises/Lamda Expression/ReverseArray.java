
import java.util.Arrays;
import java.util.function.Function;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Lambda expression to reverse the array
        Function<int[], int[]> reverseArray = (arr) -> {

            int[] reversed = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                reversed[i] = arr[arr.length - 1 - i];
            }

            return reversed;
        };

        // Call Lambda
        int[] result = reverseArray.apply(numbers);

        System.out.println("Original array: "
                + Arrays.toString(numbers));

        System.out.println("Reversed array: "
                + Arrays.toString(result));
    }
}

