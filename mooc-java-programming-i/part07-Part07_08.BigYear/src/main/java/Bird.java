import java.util.ArrayList;

public class Bird {

    private String name;
    private String latinName;
    public int obs;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.obs = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void addObservation() {
        this.obs++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.obs + " observations";
    }
}
