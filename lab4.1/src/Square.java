public class Square extends Rectangle{
    protected double side;

    public Square(){
        super(100, 100);
        side = 100;
    }

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
