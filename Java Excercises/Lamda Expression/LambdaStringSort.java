
import java.util.Arrays;

public class LambdaStringSort {

    public static void main(String[] args) {

        String[] names = {
            "Vaishnavi",
            "Rahul",
            "Amit",
            "Sneha",
            "Priya"
        };

        // Sort using Lambda expression
        Arrays.sort(names, (a, b) -> a.compareTo(b));

        // Print sorted array
        System.out.println("Sorted names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}

