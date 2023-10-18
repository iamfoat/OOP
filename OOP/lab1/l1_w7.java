import java.util.Scanner;

public class l1_w7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input x,n: ");
        int sum =0;
        int x = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            sum+=Math.pow(x, i);
        }
        System.out.println("Output is "+sum);
    }
    
}
