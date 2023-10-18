class Rectangle {
    private double width;
    private double height;
    private double x;
    private double y;

    public Rectangle() {
        width = 1;
        height = 1;
        x = 0;
        y = 0;
    }

    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return width * height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean contains(Line a) {
        double minX = Math.min(x, x + width);
        double maxX = Math.max(x, x + width);
        double minY = Math.min(y, y + height);
        double maxY = Math.max(y, y + height);

        double x1 = a.getX1();
        double y1 = a.getY1();
        double x2 = a.getX2();
        double y2 = a.getY2();

        return x1 >= minX && x1 <= maxX && y1 >= minY && y1 <= maxY &&
               x2 >= minX && x2 <= maxX && y2 >= minY && y2 <= maxY;
    }
}

class Line {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line() {
        x1 = 0;
        y1 = 0;
        x2 = 1;
        y2 = 1;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLong() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public boolean cross(Line b) {
        double x1 = this.getX1();
        double y1 = this.getY1();
        double x2 = this.getX2();
        double y2 = this.getY2();
        double x3 = b.getX1();
        double y3 = b.getY1();
        double x4 = b.getX2();
        double y4 = b.getY2();

        double d = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (d == 0) {
            return false;
        }

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / d;
        double u = -((x1 - x2) * (y1 - y3) - (y1 - y2) * (x1 - x3)) / d;

        return t >= 0 && t <= 1 && u >= 0 && u <= 1;
    }
}

public class l6_w8 {
    public static void main(String[] args) {
        
    }
}
