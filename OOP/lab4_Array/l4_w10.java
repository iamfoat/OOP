import java.util.Scanner;

public class l4_w10 {
    public static void main(String[] args) {
        PathFinder pathFinder = new PathFinder();
        pathFinder.findPathInArray();
    }
}

class PathFinder {
    private int[][] grid;
    private int[] pathDirections;
    private int startingColumn;

    PathFinder() {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();
        startingColumn = scanner.nextInt();
        grid = new int[numCols][numRows];
        pathDirections = new int[numCols];

        for (int row = 0; row < numCols; row++) {
            for (int col = 0; col < numRows; col++) {
                grid[row][col] = scanner.nextInt();
            }
        }
    }

    public boolean isPath(int row, int col, int step) {
        if (col - 1 >= 0 && row + 1 < grid.length && grid[row + 1][col - 1] == 0 && isPath(row + 1, col - 1, step + 1)) {
            pathDirections[step] = 1; 
            return true;
        }
        if (col + 1 < grid[0].length && row + 1 < grid.length && grid[row + 1][col + 1] == 0 && isPath(row + 1, col + 1, step + 1)) {
            pathDirections[step] = 2; 
            return true;
        }
        if (row + 1 < grid.length && grid[row + 1][col] == 0 && isPath(row + 1, col, step + 1)) {
            pathDirections[step] = 3; 
            return true;
        }
        if (row == grid.length - 1) {
            return true;
        }
        return false;
    }

    public void findPathInArray() {
        if (isPath(-1, startingColumn - 1, 0)) {
            for (int direction : pathDirections) {
                System.out.println(direction);
            }
        }
    }
}
