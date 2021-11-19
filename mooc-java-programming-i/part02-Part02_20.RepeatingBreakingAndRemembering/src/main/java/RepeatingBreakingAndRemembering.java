
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sumOfNumbers = 0;
        int amountOfNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number != -1) {
                System.out.println(number);
                sumOfNumbers += number;
                amountOfNumbers++;

                if (number % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }

            } else {
                System.out.println("Thx! Bye!");
                break;
            }

        }
        double average = 1.0 * sumOfNumbers / amountOfNumbers;

        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + amountOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
