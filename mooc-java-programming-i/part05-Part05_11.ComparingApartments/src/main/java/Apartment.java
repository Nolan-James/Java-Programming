
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int cost = this.princePerSquare * this.squares;
        int otherCost = compared.princePerSquare * compared.squares;
        return Math.abs(cost - otherCost);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int cost = this.princePerSquare * this.squares;
        int otherCost = compared.princePerSquare * compared.squares;
        return cost > otherCost;
    }

}
