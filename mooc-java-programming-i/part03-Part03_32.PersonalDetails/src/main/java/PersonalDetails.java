
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int sum = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] parts = sentence.split(",");

            for (int i = 0; i < parts.length - 1; i++) {
                sum += Integer.valueOf(parts[1]);
                count++;

                if (parts[0].length() > longestName.length()) {
                    longestName = parts[0];
                }
            }
        }

        average = 1.0 * sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
