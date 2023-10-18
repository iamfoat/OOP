import java.util.Scanner;

public class l5_w6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] result = new int[r][c]; 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j] = sc.nextInt();
            }
        }
        System.out.println(isConsecutiveFour(result));
    }
    
    public static boolean isConsecutiveFour(int[][] values){
    
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j <= values[i].length - 4; j++) {
                if (values[i][j] == values[i][j + 1] && values[i][j] == values[i][j + 2] && values[i][j] == values[i][j + 3]) {
                    return true;
                }
            }
        }
        
        for (int j = 0; j < values[0].length; j++) {
            for (int i = 0; i <= values.length - 4; i++) {
                if (values[i][j] == values[i + 1][j] && values[i][j] == values[i + 2][j] && values[i][j] == values[i + 3][j]) {
                    return true;
                }
            }
        }
        
        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = 0; j <= values[i].length - 4; j++) {
                if (values[i][j] == values[i + 1][j + 1] && values[i][j] == values[i + 2][j + 2] && values[i][j] == values[i + 3][j + 3]) {
                    return true;
                }
            }
        }
        
        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = values[i].length - 1; j >= 3; j--) {
                if (values[i][j] == values[i + 1][j - 1] && values[i][j] == values[i + 2][j - 2] && values[i][j] == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }
        return false;
    }
}
