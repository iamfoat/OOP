import java.util.Scanner;

public class l1_w6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input of columns and rows: ");
        int c = sc.nextInt();
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.println((i*j)+"\t");
            }
            System.out.print(" ");
        }
    }
}
