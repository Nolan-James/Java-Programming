
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            numbers.add(userInput);
        }
        int sum = 0;
        double average = 0;
        int size = numbers.size();

        for (int number : numbers) {
            sum += number;
        }

        average = 1.0 * sum / size;

        System.out.println("Average: " + average);

        
    }
}