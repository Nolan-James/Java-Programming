
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner numberFile = new Scanner(Paths.get(file))) {
            while (numberFile.hasNextLine()) {
                list.add(Integer.valueOf(numberFile.nextLine()));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int value : list) {
            if (value >= lowerBound && value <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);

    }

}
