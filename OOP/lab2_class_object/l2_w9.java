import java.util.Scanner;

public class l2_w9 {
    private int maxPrime;

    public l2_w9(){
        this.maxPrime = -1;
    }
    public void findMaximumPrime(){
        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            num = scanner.nextInt();
            if(num!=0 && isPrime(num) && num>maxPrime){
                maxPrime = num;
            }
        }
        while(num!=0);
        scanner.close();

    }
    private boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public int getMaxPrime(){
        return maxPrime;
    }
}

