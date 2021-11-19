import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scan.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scan.nextLine());

            books.add(new Book(title, pages, year));

        }

        System.out.println("What information will be printed?");
        String result = scan.nextLine();

        if (result.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle());
            };
        }

    }
}
