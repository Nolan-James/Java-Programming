
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();

                Bird bird = new Bird(name, latinName);

                birds.add(bird);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String birdObserved = scan.nextLine();

                for (Bird bird : birds) {
                    if (bird.getName().equals(birdObserved)) {
                        bird.addObservation();
                    }
                }
            }

            if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.println("Bird?");
                String birdRequested = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(birdRequested)) {
                        System.out.println(bird);
                    }
                }
            }

        }

    }

}
