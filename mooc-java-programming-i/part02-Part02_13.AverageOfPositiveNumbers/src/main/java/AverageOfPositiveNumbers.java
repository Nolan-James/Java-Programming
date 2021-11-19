
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0;
        int amount = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number != 0 && number > 0) {
                positiveSum += number;
                amount ++;
                continue;
            } else if (number < 0) {
                continue;
            } else {
                break;
            }
        }
        if (positiveSum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double result = 1.0 * positiveSum / amount;
            System.out.println(result);
        }

    }
}
