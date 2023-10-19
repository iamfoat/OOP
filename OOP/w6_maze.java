import java.util.Scanner;

public class w6_maze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int rs = scanner.nextInt();
        int cs = scanner.nextInt();
        int re = scanner.nextInt();
        int ce = scanner.nextInt();

        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int[][] distances = new int[M][N];
        distances[rs - 1][cs - 1] = 0;
        int maxDistance = M * N;
        int shortestDistance = maxDistance;
        int wallCount = 0;

        for (int distance = 0; distance <= shortestDistance; distance++) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (grid[i][j] == 1) {
                        wallCount++;
                    }
                    if (grid[i][j] == 0) {
                        int minDistance = maxDistance;

                        if (i > 0) {
                            minDistance = Math.min(minDistance, distances[i - 1][j]);
                        }

                        if (j > 0) {
                            minDistance = Math.min(minDistance, distances[i][j - 1]);
                        }

                        if (i > 0 && j > 0) {
                            minDistance = Math.min(minDistance, distances[i - 1][j - 1]);
                        }

                        distances[i][j] = minDistance + 1;

                        if (i + 1 == re && j + 1 == ce) {
                            shortestDistance = distances[i][j];
                        }
                    }
                }
            }
        }

        System.out.println(wallCount);
        System.out.println(shortestDistance);
    }
}
