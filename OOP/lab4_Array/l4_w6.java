import java.util.Scanner;

public class l4_w6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double[][] point = new double[(int)n][2];
        for(int i=0;i<n;i++){
            point[i][0] = sc.nextDouble();
            point[i][1] = sc.nextDouble();
        }
        double mindist = Double.MAX_VALUE;
        int p1 = 0;
        int p2 = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double dist = calDist(point[i][0], point[i][1], point[j][0], point[j][1]);
                if (dist < mindist) {
                    mindist = dist;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println(mindist);
    }
    public static double calDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
