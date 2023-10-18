public class l7_w1{
    public static void main(String[] args){
        Object fruit = new Fruit();
        Object apple= new (Apple)fruit; 
    }
}
class Apple extends Fruit{ 

}
class Fruit{

}