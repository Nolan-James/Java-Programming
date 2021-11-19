public class Container {

    private int amount = 0;

    public Container() {
    }

    public int contains() {
        return amount;
    }

    public void add(int amount) {
        if (!(amount < 0)) {

            if (!(this.amount + amount > 100)) {
                this.amount += amount;
            } else {
                this.amount = 100;
            }
        }

    }

    public void remove(int amount) {
        if (!(amount < 0)) {
            if (amount > this.amount) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }
        }
    }

    public String toString() {
        return amount + "/100";
    }
}
