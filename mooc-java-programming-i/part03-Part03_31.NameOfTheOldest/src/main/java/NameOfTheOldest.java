
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldest = "";
        int ageOldest = 0;

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }
            String[] words = sentence.split(",");

            for (int i = 0; i < words.length; i++) {
                if (Integer.valueOf(words[1]) > ageOldest) {
                    ageOldest = Integer.valueOf(words[1]);
                    oldest = words[0];
                }
            }
        }
        System.out.println(oldest);
    }
}
