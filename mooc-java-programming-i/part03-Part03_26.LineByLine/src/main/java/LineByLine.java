
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (!userInput.equals("")) {
                String[] pieces = userInput.split(" ");

                for (String word : pieces) {
                    System.out.println(word);
                }
            } else {
                break;
            }
        }

    }
}
