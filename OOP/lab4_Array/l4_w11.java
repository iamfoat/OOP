import java.util.Scanner;

class OilField {
    private char[][] field;
    private int numOil = 0;

    OilField(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        field = new char[rows][columns];
        
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = scanner.next().charAt(0);
            }
        }
    }

    public int countOil() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (isOil(i, j)) {
                    spreadOil(i, j);
                    numOil++;
                }
            }
        }
        return numOil;
    }

    public boolean isOil(int row, int column) {
        if (field[row][column] == '@') {
            field[row][column] = '*';
            return true;
        }
        return false;
    }

    public void spreadOil(int row, int column) {
        if (row + 1 < field.length && column + 1 < field[0].length) {
            if (isOil(row + 1, column + 1)) {
                spreadOil(row + 1, column + 1);
            }
        }
        if (row + 1 < field.length && column - 1 >= 0) {
            if (isOil(row + 1, column - 1)) {
                spreadOil(row + 1, column - 1);
            }
        }
        if (row - 1 >= 0 && column + 1 < field[0].length) {
            if (isOil(row - 1, column + 1)) {
                spreadOil(row - 1, column + 1);
            }
        }
        if (row - 1 >= 0 && column - 1 >= 0) {
            if (isOil(row - 1, column - 1)) {
                spreadOil(row - 1, column - 1);
            }
        }
        if (row + 1 < field.length) {
            if (isOil(row + 1, column)) {
                spreadOil(row + 1, column);
            }
        }
        if (row - 1 >= 0) {
            if (isOil(row - 1, column)) {
                spreadOil(row - 1, column);
            }
        }
        if (column - 1 >= 0) {
            if (isOil(row, column - 1)) {
                spreadOil(row, column - 1);
            }
        }
        if (column + 1 < field[0].length) {
            if (isOil(row, column + 1)) {
                spreadOil(row, column + 1);
            }
        }
    }
}

class l4_w11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        OilField oilField = new OilField(rows, columns);
        System.out.println(oilField.countOil());
    }
}
