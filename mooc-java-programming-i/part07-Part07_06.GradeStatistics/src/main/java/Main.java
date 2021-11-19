
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(statistics, scanner);

        userInterface.start();

    }
}
