
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber != 0) {
                totalCount++;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + totalCount);

    }
}
