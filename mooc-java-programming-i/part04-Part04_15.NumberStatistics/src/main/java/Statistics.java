
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {

    }

    public void addNumber(int number) {
        this.count++;
        sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count > 0) {
            return 1.0 * sum / count;
        } else {
            return 0;
        }
    }
}
