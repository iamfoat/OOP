import java.util.Scanner;

public class l4_w4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextDouble();
        }
        AscendSortFreq obj = new AscendSortFreq(arr);
        double[] K = obj.AscendSortFreq(obj.A);
        obj.print(K);
        
        System.out.println("");
        int[] c = obj.SortCommuFrea(K);
        for(int i=0;i<c.length;i++){
            if(c[i]==0){

            }
            else{
                System.out.print(c[i]+" ");
            }
            System.out.print("");
        }
    }
}

class AscendSortFreq{
    double[] A;
    AscendSortFreq(){

    }
    AscendSortFreq(double[] arr){
        A = new double[arr.length];
        for(int i=0;i<A.length;i++){
            this.A[i] = arr[i];
        }
    }
    public double[] AscendSortFreq(double[] A){
        double[] B = new double[A.length];
        double tmp=0;
        //sorting
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
            B = A;
        }
        return B;
    }
    public int[] SortCommuFrea(double[] B){
        int[] c = new int[B.length];
        boolean[] visited = new boolean[B.length];
        int j=0,k=0;
        for(int i=0;i<B.length;i++){
            if(visited[i]==true){
                continue;
            }
            //count Freq
            int count =1;
            for(j=i+1;j<B.length;j++){
                if(B[i] == B[j]){
                    visited[j]=true;
                    count++;
                }
            }
            c[k] = count;
            k++;
        }
        return c;
    }
    public void print(double[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]!=A[i+1]){
                System.out.print(A[i]+" ");
            }
        }
        System.out.print(A[A.length-1]+" ");
    }
}