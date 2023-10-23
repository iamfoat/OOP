public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    protected GeometricObject() {
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(6);
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(4, 3);
        Octagon o1 = new Octagon(4);
        Octagon o2 = new Octagon(5);
        ComparableCircle cc1 = new ComparableCircle(4);
        ComparableCircle cc2 = new ComparableCircle(6);

        System.out.println("Circle1 = Circle2 ? " + c1.equals(c2));
        System.out.println("Rectangle1 = Rectangle2 ? " + r1.equals(r2));
        System.out.println("Octagon1 = Octagon2 ? " + o1.equals(o2));
    
    }
}

class Circle extends GeometricObject implements Comparable<Circle>{
    double radius;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public boolean equals(Object o) {
     if (o instanceof Circle) {
            Circle Circle2 = (Circle) o;
            return this.radius == Circle2.radius;
        }
        return false;
    }
    @Override
    public int compareTo(Circle Circle2) {
        return Double.compare(this.radius, Circle2.radius);
    }
}

class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    double w;
    double h;
    public Rectangle(){

    }
    public Rectangle(double w,double h){
        this.w = w;
        this.h = h;
    }
     public double getWidth() {
        return w;
    }

    public void setWidth(double w) {
        this.w = w;
    }

    public double getHeight() {
        return h;
    }

    public void setHeight(double h) {
        this.h = h;
    }
    @Override
    public double getArea() {
        return w*h;
    }
    @Override
    public double getPerimeter() {
        return 2*(w+h);
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Rectangle){
            Rectangle Rec2 = (Rectangle) o;
            return this.area == Rec2.area;
        }
        return false;
    }
    @Override
    public int compareTo(Rectangle Rec2) {
        return Double.compare(this.getArea(), Rec2.getArea());
    }
}

class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    double side;

    public Octagon() {
    }
    public Octagon(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return (2+4/Math.sqrt(2))*side*side;
    }
    @Override
    public double getPerimeter() {
        return 8*side;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Octagon){
            Octagon Oc2 = (Octagon)o;
            return this.area == Oc2.area;
        }
        return false;
    }

    @Override
    public int compareTo(Octagon Oc2) {
        return Double.compare(this.getArea(), Oc2.getArea());
    }

    @Override
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException ex){
            return null;
        }
    }
}

class ComparableCircle extends Circle implements Comparable<Circle>{
    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(Circle other) {
        if (getArea() < other.getArea()) {
            return -1;
        } else if (getArea() > other.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "ComparableCircle{radius=" + getRadius() + ", area=" + getArea() + "}";
    }
}

// public class GeometricObject{
//     public static void main(String[] args){
//         Circle c1 = new Circle(5);
//         Circle c2 = new Circle(6);
//         Rectangle r1 = new Rectangle(3, 4);
//         Rectangle r2 = new Rectangle(4, 3);
//         Octagon o1 = new Octagon(4);
//         Octagon o2 = new Octagon(5);
//         ComparableCircle cc1 = new ComparableCircle(4);
//         ComparableCircle cc2 = new ComparableCircle(6);

//         System.out.println("Are c1 and c2 equal? " + c1.equals(c2));
//         System.out.println("Are r1 and r2 equal? " + r1.equals(r2));
//         System.out.println("Are o1 and o2 equal? " + o1.equals(o2));
//         System.out.println("Are cc1 and cc2 equal? " + cc1.equals(cc2));

//         System.out.println("Comparing c1 and c2: " + c1.compareTo(c2));
//         System.out.println("Comparing r1 and r2: " + r1.compareTo(r2));
//         System.out.println("Comparing o1 and o2: " + o1.compareTo(o2));
//         System.out.println("Comparing cc1 and cc2: " + cc1.compareTo(cc2));
//     }
// }


