public class mainl2_w9 {
    public static void main(String[] args){
        System.out.println("Input list of number use 0 to stop Program: ");
        
        l2_w9 finder = new l2_w9();
        finder.findMaximumPrime();

        int maxPrime = finder.getMaxPrime();
        if(maxPrime == -1){
            System.out.println("No prime numbers were found in the input.or Maxprime is: "+maxPrime);
        }
        else{
            System.out.println("The maximum prime number is: "+maxPrime);
        }       
}
}
