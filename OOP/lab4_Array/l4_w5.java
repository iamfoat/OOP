import java.util.Scanner;

public class l4_w5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] A = new int[r1][c1]; 
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] B = new int[r2][c2]; 
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        if(A[0].length != B.length){
            System.out.println("Multiplication undifined");
        }
        else{
            MatrixMultiplication matrixMult = new MatrixMultiplication();
            int[][] ans = matrixMult.calMat(A,B);
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    }
}
class MatrixMultiplication{
    public MatrixMultiplication(){
        
    }
    public int[][] calMat(int[][] A,int[][] B){
        int[][] C = new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                for(int k=0;k<A[0].length;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }

}