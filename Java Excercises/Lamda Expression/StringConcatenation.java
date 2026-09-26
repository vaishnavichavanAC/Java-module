
import java.util.Scanner;
import java.util.function.BiFunction;

public class StringConcatenation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Lambda expression to concatenate two strings
        BiFunction<String, String, String> concatenate =
                (a, b) -> a + b;

        // Apply Lambda
        String result = concatenate.apply(str1, str2);

        System.out.println("Concatenated string: " + result);

        sc.close();
    }
}

