import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                addTranslation();
            } else if (command.equals("search")) {
                search();
            } else {
                System.out.println("Unknown command");

            }
        }
    }

    private void addTranslation() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    private void search() {
        System.out.println("To be translated:");
        String originalWord = scanner.nextLine();
        String translation = dictionary.translate(originalWord);

        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word " + originalWord + " was not found");
        }

    }
}
