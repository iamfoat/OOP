import java.util.ArrayList;
import java.util.Scanner;

public class l5_w2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Star starlist = new Star();

    while(true){
        String input = sc.next();
        if(input.equals("1")){
            starlist.addStar();;
        }
        else if(input.equals("2")){
            starlist.removeStar();
        }
        else if(input.equals("0")){
            break;
        }
        else{
            starlist.StarList.add(input);
        }
    }
}
}

class Star{
    ArrayList<String> StarList = new ArrayList<>();
    public void addStar(){
        for(int i=0;i<StarList.size();i+=2){
            StarList.add(i+1,"*");
        }
        System.out.println(StarList);
    }

    public void removeStar(){
        int index = 1;
        while (index < StarList.size()) {
        StarList.remove(index);
        index++;
    }
    System.out.println(StarList);
    }
}