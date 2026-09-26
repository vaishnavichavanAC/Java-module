
import java.time.LocalDate;
import java.util.function.Supplier;

public class CurrentDate {

    public static void main(String[] args) {

        // Lambda expression to get current date
        Supplier<LocalDate> currentDate = () -> LocalDate.now();

        // Call Lambda expression
        LocalDate date = currentDate.get();

        System.out.println("Current date: " + date);
    }
}

