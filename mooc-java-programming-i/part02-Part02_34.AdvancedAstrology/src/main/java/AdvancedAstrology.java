
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i< number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = size, j = 0; i >= 0; i--, j++) {
            printSpaces(i);
            printStars(j);
        }
    }

    public static void christmasTree(int height) {


//        printSpaces(height / 2);
//        printStars(3);
//        printSpaces(height / 2);
//        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
