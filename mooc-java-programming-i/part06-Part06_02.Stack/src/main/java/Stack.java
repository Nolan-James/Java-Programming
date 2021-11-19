import java.util.ArrayList;

public class Stack {

    ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        String lastItem = list.get(list.size() - 1);

        list.remove(lastItem);
        return lastItem;
    }
}
