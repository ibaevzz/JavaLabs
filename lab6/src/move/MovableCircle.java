package move;

import move.Movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint point;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        point = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveDown() {
        point.moveDown();
    }
    @Override
    public void moveUp() {
        point.moveUp();
    }
    @Override
    public void moveLeft() {
        point.moveLeft();
    }
    @Override
    public void moveRight() {
        point.moveRight();
    }
    @Override
    public String toString() {
        return point.toString()+", radius: "+radius;
    }
}
