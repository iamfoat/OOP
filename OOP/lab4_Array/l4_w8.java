import java.util.Scanner;

public class l4_w8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] A = new int[H][W];
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        int maxSum = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(i<H-1 && Math.abs(A[i][j]-A[i+1][j])<=10){
                    if (A[i][j]+A[i+1][j] > maxSum) {
                        maxSum = A[i][j]+A[i+1][j];
                        row = i;
                        col = j;
                }
                }
            }
        }
        System.out.println((row + 1) + " " + (col + 1));
    }
}
