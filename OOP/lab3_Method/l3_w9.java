import java.util.Scanner;

public class l3_w9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        if(leftOfTheLine(x0 ,y0 ,x1 ,y1 ,x2 ,y2)){
            System.out.println(2) ;
        }else if(onTheLineSegment(x0, y0, x1, y1, x2, y2)){
            System.out.println(1) ;
        }else if(onTheSameLine(x0, y0, x1, y1, x2, y2)){
            System.out.println(0) ;
        }


    }
    public static boolean leftOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double m = (y1 -y0)/(x1 -x0) ;
        if(y2 - y0 - m * (x2 - x0) > 0){
            return true ;
        }
        return false ;
    }
    public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double m = (y1 -y0)/(x1 -x0) ;
        if(y2 - y0 - m * (x2 - x0) == 0){
            return true ;
        }
        return false ;
    }
    public static boolean onTheLineSegment(double x0,double y0,double x1,double y1,double x2,double y2){
        double m = (y1 -y0)/(x1 -x0) ;
        if(y2 - y0 - m * (x2 - x0) < 0){
            return true ;
        }
        return false ;
    }

}
