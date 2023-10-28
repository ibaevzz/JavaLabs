package priceable;

public class Apple implements Priceable {
    private final int price;
    public Apple(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
