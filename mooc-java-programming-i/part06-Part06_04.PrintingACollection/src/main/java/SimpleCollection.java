
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String textOutput = "";
        String listOutput = "";
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            if (elements.size() == 1) {
                textOutput = "The collection " + this.name + " has " + this.elements.size() + " element:";
            } else {
                textOutput = "The collection " + this.name + " has " + this.elements.size() + " elements:";
            }

//            for (String element : this.elements) {
//                listOutput = listOutput + element + "\n";
//            }

            for (int i = 0; i < this.elements.size(); i++) {
                if (i == this.elements.size() - 1) {
                    listOutput += this.elements.get(i);
                } else {
                    listOutput += this.elements.get(i) + "\n";
                }
            }
        }
        return textOutput + "\n" + listOutput;
    }

}
