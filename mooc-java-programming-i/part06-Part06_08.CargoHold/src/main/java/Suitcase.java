import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = totalWeight();

        if (!(item.getWeight() + totalWeight > maximumWeight)) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        int amountOfItems = items.size();
        int totalWeight = totalWeight();

        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return amountOfItems + " item " + "(" + totalWeight + " kg)";
        } else {
            return amountOfItems + " items " + "(" + totalWeight + " kg)";
        }
    }

}
