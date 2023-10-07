public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        color = "Black";
        filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Shape{"+"color="+color+", filled="+filled+"}";
    }
}
