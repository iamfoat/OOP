public class l4_w3 {
    public static void main(String[] args){
        int[] list = {1,9,3,7,2};
        list = dosomething(list);
    }
    public static int[] dosomething(int[] input){
        int temp;
        for(int i=1;i<input.length;i++){
            for(int j=i;j>0;j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        return input;
    }
}
