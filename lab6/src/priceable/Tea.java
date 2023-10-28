package priceable;

public class Tea implements Priceable {
    private final int price;
    public Tea(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
