
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userWord = scanner.nextLine();

        System.out.print(userWord + userWord + userWord);

    }
}
