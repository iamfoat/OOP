import java.util.Scanner;

public class l2_w5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a b c d e f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        solve linear = new solve(a, b, c, d, e, f);
        if(linear.isSolveable()){
            System.out.println("x is "+linear.getX()+" and Y is "+linear.getY());
        }
        else{
            System.out.println("The equation has no solution");
        }
    }
}
class solve{
    private double a,b,c,d,e,f;

    solve(){

    }
    solve(double a,double b,double c,double d,double e,double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean isSolveable(){
        if((a*d-b*c)==0){
            return false;
        }
        else{
            return true;
        }
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }

}