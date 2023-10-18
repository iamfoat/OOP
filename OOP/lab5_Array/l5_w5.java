import java.util.ArrayList;
import java.util.Scanner;

public class l5_w5{
    public static void printEmp(ArrayList<Employee> A){
        System.out.println("Firstname | Lastname | Earning | Bonus");
        for(int i=0;i<A.size();i++){
            Employee obj = A.get(i);
            System.out.println(" "+obj.getName()+"\t"+obj.getlastname()+"\t\t "+obj.earning()+"\t "+obj.bonus(obj.getyear()));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> EmpList = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String firstname = sc.next();
            String lastname = sc.next();
            String id = sc.next();
            double salary = sc.nextDouble();
            int year = sc.nextInt();
            Employee Empobj = new Employee(firstname, lastname, id, salary);
            Empobj.setYear(year);
            EmpList.add(Empobj);
        }
        printEmp(EmpList);
    }
    
}

class Employee{
    private String firstname,lastname,id;
    private double salary;
    private int year;

    Employee(){

    }
    public Employee(String firstname,String lastname,String id,double salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.salary  = salary;
    }
    public String getName(){
        return this.firstname;
    }
    public String getlastname(){
        return this.lastname;
    }
    public double getsal(){
        return this.salary;
    }
    public int getyear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double earning(){
        return salary*95/100;
    }
    public double bonus(int year){
        double bonus = 0;
        if(year>5){
            bonus = salary*12;
        }
        else{
            bonus = salary*6;
        }
        return bonus;
    }
    // @Override
    // public String toString(){
    //     return "Employee Infomation \n Id: "+id+"Name: "+firstname+""+lastname+"Salary: "+salary+"Earning"+earning();
    // }
}