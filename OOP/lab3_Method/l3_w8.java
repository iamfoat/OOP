import java.util.Scanner;

public class l3_w8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Estimate(i));
    }
    public static double Estimate(double i){
        double result = 0.0;
        for (int j = 1; j <= i; j++) {
            result += 4.0 * (Math.pow(-1, j + 1) / ((2 * j) - 1));
        }
        return result;
    }
}
