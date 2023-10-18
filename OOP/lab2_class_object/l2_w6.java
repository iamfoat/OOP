import java.sql.Date;
import java.util.Scanner;

public class l2_w6 {
    public static void main(String[] args){
        Date FasaiDate = new Date(27, 07, 2023);
        Account FasaiAccount = new Account(1122,20000);
        FasaiAccount.setAnnaualInterestRate(4.5);
        FasaiAccount.setDate(FasaiDate);
        FasaiAccount.withdraw(2500);
        FasaiAccount.deposite(3000);
        System.out.println(FasaiAccount);
        System.out.println("Monthly Interest: "+FasaiAccount.getMonthlyInterest());
    }
}

class Date{
    int d,m,y;
    Date(){

    }
    public Date(int d,int m,int y){
        this.d = d;
        this.m = m;
        this.y = y;
    }
}
class Account{
    private int id;
    private double balance,annualInterestRate;
    private Date dataCreated;
    public Account(){

    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }
    public void setDate(Date dateCreated){
        this.dataCreated = dateCreated;
    }
    public void setAnnaualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return this.balance+annualInterestRate;
    }
    public double getMonthlyInterest(){
        return (this.balance*this.annualInterestRate/100)/12;
    }
    public void withdraw(double amount){
        this.balance = this.balance + amount;
    }
    public void deposite(double amount){
        this.balance = this.balance - amount;
    }
    public String toString(){
        return "Account: "+id+" balance: "+balance;
    }
}