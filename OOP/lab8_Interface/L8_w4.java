/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l8_w4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class L8_w4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<Employee>();
        SalariedEmployee x;
        x = new SalariedEmployee("Sha","bu","0001",20000);
        arr.add(x);
        x = new SalariedEmployee("Gee","Maa","0002",13000);
        arr.add(x);
        ComEmployee y;
        y = new ComEmployee("Mhaa","Laa","0003",25000,5);
        arr.add(y);
        y = new ComEmployee("Moo","Ta","0004",18000,3);
        arr.add(y);
        printEmp(arr);
    }
    public static void printEmp(ArrayList<Employee> z){
        double[] arrEarn = new double[z.size()];
        double[] arrBonus = new double[z.size()];
        for(int i=0;i<z.size();i++){
            Employee a = z.get(i);
            arrEarn[i] = a.earning();
            arrBonus[i] = a.bonus(10);
            System.out.println(" "+a.getname()+" "+a.getsurnmae()+" "+a.getid()+" "+a.earning()+" "+a.bonus(i));
        }
    }
    
}

abstract class Employee{
    private String firstname;
    private String lastname;
    private String id;
    public Employee(String firstname,String lastname,String id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }
    public abstract double earning();
    public abstract double bonus(int year);
    
    public String getname(){
        return  firstname;
    }
    public String getsurnmae(){
        return  lastname;
    }
    public String getid(){
        return  id;
    }
}
 
class SalariedEmployee extends Employee{
    double salary;
    public SalariedEmployee(String firstname,String lastname,String id,double sal){
        super(firstname,lastname,id);
        this.salary = sal;
    }

    @Override
    public double earning() {
        return salary-salary*0.5;
    }

    @Override
    public double bonus(int year) {
        if(year>5){
            return salary*12;
        }
        else{
            return salary*6;
        }
    }
}
class ComEmployee extends Employee{
    double grossSale;
    double ComRate;
    public ComEmployee(String firstname,String lastname,String id,double sales,double percent){
        super(firstname,lastname,id);
        this.grossSale = sales;
        this.ComRate = percent; 
    }
    @Override
    public double earning() {
        return grossSale+(grossSale*(ComRate/100));
    }

    @Override
    public double bonus(int year) {
        if(year>5){
            return 6*grossSale;
        }
        else{
            return 3*grossSale;
        }
    }
    
}
