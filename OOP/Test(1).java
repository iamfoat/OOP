/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author student
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingAccount FasaiAcc = new SavingAccount(1123,20000);
        SavingAccount PangAcc = new SavingAccount(1124,500);
        Person Fasai = new Person("Fasai","Tamrit");
        Person Pang = new Person("Sakul","Pang");
        FasaiAcc.setPerson(Fasai);
        FasaiAcc.setdateCreated(new Date(7,"Sep",2023));
        PangAcc.setPerson(Pang);
        FasaiAcc.withdraw(3000);
        PangAcc.transferMoney(FasaiAcc, 200);
        System.out.println(""+FasaiAcc);
        System.out.println(""+PangAcc);
        
    }

}
class Account{
    private int id;
    private double balance;
    private double annualLnterestRate;
    private Date dateCreated;
    private Person objPerson;
    
    Account(){
        
    }
    Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }
    public double getbalance(){
        return this.balance;
    }
    public Date getdateCreated(){
        return dateCreated;
    }
    public void setdateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualLnterestRate = annualInterestRate;
    }
    public double getAnnuallInterestRate(){
        return this.balance*this.annualLnterestRate;
    }
    public double getMonthlyInterestRate(double balance){
        return (this.balance*this.annualLnterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        Date current = new Date(7,"Sep",2023);
        int numberOfMonth = (this.getdateCreated().y-current.y);
        return numberOfMonth*this.balance*(this.annualLnterestRate)/12;
    }
    public void withdraw(double amt){
        this.balance = this.balance-amt;
    }
    public void deposit(double amt){
        this.balance = this.balance+amt;
    }
    public void setPerson(Person p){
        this.objPerson = p;
    }
    public Person getPerson(){
        return this.objPerson;
    }
    public void transferMoney(Account acc,double amt){
        this.balance -= amt;
        acc.balance += amt;  
    }
    @Override
    public String toString(){
        return "accunt id = "+id+"\n balance = "+balance+"\n Date Created = "+dateCreated
                +"\n Monthly interest "+getMonthlyInterest();
    }
     
}
class Date{
    int d;
    int m;
    int y;
    String month;
    
    Date(){
        
    }
    Date(int d,String month,int y){
        this.d = d;
        this.month = month;
        this.y = y;
    }
    public void setyear(int y){
        this.y = y;
    }
    public int getyear(){
        return this.y;
    }
    public int StringtoIntmonth(){
        if(month.equals("Jan"))return 1;
        else if(month.equals("Feb"))return 2;
        else if(month.equals("Mar"))return 3;
        else if(month.equals("Apr"))return 4;
        else if(month.equals("May"))return 5;
        else if(month.equals("Jun"))return 6;
        else if(month.equals("Jul"))return 7;
        else if(month.equals("Aug"))return 8;
        else if(month.equals("Sep"))return 9;
        else if(month.equals("Oct"))return 10;
        else if(month.equals("Nov"))return 11;
        else return 12;   
    }
    @Override
    public String toString(){
        return d+"/"+month+"/"+y;
    }
}

class Person{
    String name;
    String surname;
    int age;
    Date bDate = new Date();
            
    Person(){
        
    }
    Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString(){
        return " "+name+" "+surname; 
    }
    
}


class SavingAccount extends Account{
    
    SavingAccount(){
        super();
    }
    SavingAccount(int id,double amt){
        super(id,amt);
    }
    @Override
    public void transferMoney(Account acc,double amt){
        super.transferMoney(acc,amt);
        acc.setbalance(this.getbalance()-20);
        
    }
}

class FixAccount extends Account{
    public FixAccount(){
        super();
    }
    FixAccount(int id,double amt){
        super(id,amt);
    }
    @Override
    public void transferMoney(Account acc,double amt){
        System.out.println("Can't transfer money");
    }
    @Override
    public void withdraw(double amt){
        Date current = new Date(7,"Sep",2023);
        int time = this.getdateCreated().y-current.y;
        if(time>1){
            super.withdraw(amt);
        }
        else{
            System.out.println("Can't withdraw");
        }
    }
}


