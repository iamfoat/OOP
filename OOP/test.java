// public class test {
//     public static void main(String[] args){
//         int var1 ,var2;
//         A objA = new A();
//         var1 = 5;
//         var2 = 5;
//         System.out.println(var1);
//         System.out.println(var2);
//         objA.mthodA(var1,var2);
//         System.out.println(var1);
//         System.out.println(var1);


//     }
// }
// class A{
//     int x=10,y=5;
//     void mthodA(int a,int b){
//         a = x;
//         b = y;
//     }
// }

public class test{
    public static void main(String[] args){
        System.out.println(m1(array)[1]);
    }
    public static int[] m1(int[][] m){
       int[] result = new int[2];
       result[0] = m.length;
       result[1] = m[0].length;
       return result;
    } 
}

// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int W = sc.nextInt();
//         int H = sc.nextInt();
//         int[][] A = new int[H][W];


//         for (int i = 0; i < H; i++) {
//             for (int j = 0; j < W; j++) {
//                 A[i][j] = sc.nextInt();
//             }
//         }

//         int maxSum = 0;
//         int row = -1;
//         int col = -1;

//         for (int i = 0; i < H - 1; i++) {
//             for (int j = 0; j < W - 1; j++) {
//                 int sum = A[i][j] + A[i + 1][j];
//                 if (Math.abs(A[i][j] - A[i + 1][j]) <= 10 && sum > maxSum) {
//                     maxSum = sum;
//                     row = i;
//                     col = j;
//                 }
//             }
//         }

//         if (row != -1 && col != -1) {
//             System.out.println((row + 1) + " " + (col + 1));
//         } else {
//             System.out.println("Pikachu not found.");
//         }
//     }
// }
