interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class MovableCircle implements Movable {
    MovablePoint center;
    int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public String toString() {
        return "Center: " + center + ", Radius: " + radius;
    }
}

public class Moveable {
    public static void main(String[] args){
        MovableCircle mc = new MovableCircle(0, 0, 2, 2, 20);
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();
    }
}