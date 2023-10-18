import java.util.Scanner;

public class l5_w4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] population = new int[M][N];
        for (int i=0;i<M;i++) {
            for (int j=0;j<N;j++) {
                population[i][j] = sc.nextInt();
            }
        }
        int result = area(M, N, K, population);
        System.out.println(result);
    }
    public static int area(int M, int N, int K, int[][] population) {
        int result = 0;
        for (int i=0;i<=M-K;i++) {
            for (int j=0;j<=N-K;j++) {
                int areaPop = 0;
                for (int x=i;x<i+K;x++) {
                    for (int y=j;y<j+K;y++) {
                        areaPop += population[x][y];
                    }
                }
                result = Math.max(result, areaPop);
            }
        }
        return result;
    }
}

