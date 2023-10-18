import java.util.Scanner;

public class l4_w7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] set = new int[n];

        for (int i = 0; i < n; i++) {
            set[i] = sc.nextInt(); 
        }
        
        int minDif = minDifference(set);
        System.out.println(minDif);
    }
    public static int minDifference(int[] set){
        int Sum = 0;
        for (int i = 0; i < set.length; i++) {
            Sum += set[i];
        }

        int halfSum = Sum / 2;
        boolean[] dp = new boolean[halfSum + 1];
        dp[0] = true;

        for (int i = 0; i < set.length; i++) {
            int num = set[i];
            for (int j = halfSum; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        int minDifference = Integer.MAX_VALUE;
        for (int j = halfSum; j >= 0; j--) {
            if (dp[j]) {
                minDifference = Sum - 2 * j;
                break;
            }
        }

        return minDifference;
    }
}
