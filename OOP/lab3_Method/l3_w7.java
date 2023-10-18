import java.util.Scanner;

public class l3_w7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        boolean isValidTriangle = MyTriangle.isValid(side1, side2, side3);
        double triangleArea = MyTriangle.area(side1, side2, side3);

        
        if (isValidTriangle) {
            System.out.println("1"); 
            System.out.println(triangleArea);
        } else {
            System.out.println("0"); 
        }

    }
}

class MyTriangle{
    public static boolean isValid(double side1,double side2,double side3){
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }
    public static double area(double side1,double side2 ,double side3){
        if (isValid(side1, side2, side3)) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        } else {
            return 0; 
        }
    }
}
