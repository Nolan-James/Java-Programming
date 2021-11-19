
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int amount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number != 0) {
                sum += number;
                amount ++;
                continue;
            } else {
                break;
            }
        }
        double average = 1.0 * sum / amount;
        System.out.println("Average of the numbers: " + average);

    }
}
