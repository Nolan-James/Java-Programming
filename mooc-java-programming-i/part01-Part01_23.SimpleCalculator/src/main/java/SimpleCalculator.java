
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int resultAddition = first + second;
        int resultSubtraction = first - second;
        int resultMultiply = first * second;
        double resultDivision = 1.0 * first / second;

        System.out.println(first + " + " + second + " = " + resultAddition);
        System.out.println(first + " - " + second + " = " + resultSubtraction);
        System.out.println(first + " * " + second + " = " + resultMultiply);
        System.out.println(first + " / " + second + " = " + resultDivision);

    }
}
