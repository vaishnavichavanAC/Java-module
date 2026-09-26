
import java.util.Random;
import java.util.function.Supplier;

public class GenerateOTP {

    public static void main(String[] args) {

        Random random = new Random();

        // Lambda expression to generate OTP
        Supplier<String> generateOTP = () -> {

            // Vowels
            char[] vowels = {'A', 'E', 'I', 'O', 'U'};

            // Generate first character
            char firstChar = vowels[random.nextInt(vowels.length)];

            // Generate 4 random digits
            String otp = "" + firstChar;

            for (int i = 0; i < 4; i++) {
                otp = otp + random.nextInt(10);
            }

            return otp;
        };

        // Generate OTP
        String otp = generateOTP.get();

        System.out.println("Generated OTP: " + otp);
    }
}
