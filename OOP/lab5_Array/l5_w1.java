import java.util.ArrayList;
import java.util.Scanner;

public class l5_w1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrInt = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arrInt.add(x);
        }
        double sum =0;
        for(int i=0;i<n;i++){
            sum += arrInt.get(i);
        }
        double avg = 0;
        avg = sum/n;
        System.out.println("avg = "+String.format("%.2f", avg));

        int max = arrInt.get(0);
        int min = arrInt.get(0);
        for(int i=0;i<arrInt.size();i++){
            if(max<arrInt.get(1)){
                max = arrInt.get(1);
            }
            if(min>arrInt.get(1)){
                min = arrInt.get(1);
            }
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);

        for(int i=0;i<arrInt.size();i++){
            if(arrInt.get(i)%2==0){
                arrInt.remove(i);
                i--;
            }
        }
        for(int i=0;i<arrInt.size();i++){
            System.out.println(""+arrInt.get(i));
        }
    }
}
