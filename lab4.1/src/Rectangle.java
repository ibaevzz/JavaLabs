public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        width = 100;
        length = 100;
    }

    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2.0*(width+length);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
