
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        removeLast(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {

        } else {
            strings.remove(strings.size() -1);
            System.out.println(strings);
        }

    }

}
