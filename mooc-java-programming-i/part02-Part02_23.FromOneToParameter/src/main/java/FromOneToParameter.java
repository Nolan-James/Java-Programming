

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }

    public static void printUntilNumber(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.println(i);
        }
    }

}
