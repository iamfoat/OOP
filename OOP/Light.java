import java.util.Scanner;

public class Light {
    int N, M;
    int[] light;
    int[][] plane;

    Light(int N, int M) {
        this.N = N;
        this.M = M;
        plane = new int[N][2];
        light = new int[M];
    }

    public void values() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                plane[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            light[i] = sc.nextInt();
        }
        sc.close();
    }

    public int lightpass() {
        int num = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (light[i] >= plane[j][0] && light[i] <= plane[j][1]) {
                    num++;
                    // If the light falls within the range, you should break out of the inner loop.
                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        Light keep = new Light(N, M);
        keep.values();
        int lightpassing = keep.lightpass();
        System.out.println(lightpassing);
        sc.close();
    }
}
