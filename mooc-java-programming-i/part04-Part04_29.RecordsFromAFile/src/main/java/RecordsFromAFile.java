
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                list.add(file.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : list) {
            String[] split = line.split(",");

            if ((Integer.valueOf(split[1])) > 1 || (Integer.valueOf(split[1]) == 0)){
                System.out.println(split[0] + ", age: " + split[1] + " years");
            } else {
                System.out.println(split[0] + ", age: " + split[1] + " year");
            }
        }
    }
}
