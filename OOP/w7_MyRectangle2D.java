public class w7_MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public w7_MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public w7_MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        double xMin = this.x - width / 2;
        double xMax = this.x + width / 2;
        double yMin = this.y - height / 2;
        double yMax = this.y + height / 2;

        return (x >= xMin && x <= xMax && y >= yMin && y <= yMax);
    }

    public boolean contains(w7_MyRectangle2D r) {
        double xMin = this.x - width / 2;
        double xMax = this.x + width / 2;
        double yMin = this.y - height / 2;
        double yMax = this.y + height / 2;

        double rXMin = r.x - r.width / 2;
        double rXMax = r.x + r.width / 2;
        double rYMin = r.y - r.height / 2;
        double rYMax = r.y + r.height / 2;

        return (xMin <= rXMin && xMax >= rXMax && yMin <= rYMin && yMax >= rYMax);
    }

    public boolean overlaps(w7_MyRectangle2D r) {
        double xMin = this.x - width / 2;
        double xMax = this.x + width / 2;
        double yMin = this.y - height / 2;
        double yMax = this.y + height / 2;

        double rXMin = r.x - r.width / 2;
        double rXMax = r.x + r.width / 2;
        double rYMin = r.y - r.height / 2;
        double rYMax = r.y + r.height / 2;

        return (xMin < rXMax && xMax > rXMin && yMin < rYMax && yMax > rYMin);
    }

    public static void main(String[] args) {
        
    }
}
