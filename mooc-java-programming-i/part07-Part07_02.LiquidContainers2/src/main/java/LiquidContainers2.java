
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                containerOne.add(amount);
            }

            if (command.equals("move")) {
                containerTwo.add(Math.min(containerOne.contains(), amount));
                containerOne.remove(amount);
            }

            if (command.equals("remove")) {
                containerTwo.remove(amount);
            }

        }


    }

}
