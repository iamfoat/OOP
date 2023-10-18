import java.util.Scanner;

import javax.swing.JPopupMenu.Separator;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount OneAcc = new SavingAccount(1123,20000);
        SavingAccount TwoAcc = new SavingAccount(1100,5000);
        Person Info = new Person("Fasai","Tamrit");
        Date Datee = new Date(7, "Sep", 2023);
        TwoAcc.setdateCreated(Datee);
        TwoAcc.setPerson(Info);
        OneAcc.setAnnualInterestRate(4.5);
        String name,surname,month;
        int date,age,year;
        name = sc.next();
        surname = sc.next();
        age = sc.nextInt();
        date = sc.nextInt();
        month = sc.next();
        year = sc.nextInt();
        Person OneInfo = new Person(name,surname);
        OneInfo.setAge(age);
        Date OneDate = new Date(date, month, year);
        OneInfo.setdate(OneDate);

        OneAcc.setdate(OneDate);
        OneAcc.setPerson(OneInfo);
        OneAcc.withdraw(2500);
        System.out.println(OneAcc+"\n");
        OneAcc.deposit(3000);
        System.out.println(OneAcc+"\n");
        OneAcc.transferMoney(TwoAcc, 1100);
        System.out.println(OneAcc+"\n");
        System.out.println(TwoAcc+"\n");

        FixAccount UserAccount = new FixAccount(1124, 20000);
        UserAccount.setAnnualInterestRate(7);
        name = sc.next();
        surname = sc.next();
        age = sc.nextInt();
        date = sc.nextInt();
        month = sc.next();
        year = sc.nextInt();
        Person Userinfo = new Person(name, surname);
        Userinfo.setAge(age);
        Date UserBirthDate = new Date(date, month, year);
        Userinfo.setdate(UserBirthDate);

        UserAccount.setdateCreated(UserBirthDate);
        UserAccount.setPerson(Userinfo);
        UserAccount.withdraw(2500);
        UserAccount.deposit(3000);
        UserAccount.transferMoney(UserAccount, 1100);
        System.out.println(UserAccount+"\n");
        System.out.println(TwoAcc+"\n");
        
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
    public String getName(){
        return this.objPerson.getName();
    }
    public String getSurname(){
        return this.objPerson.getSurname();
    }
    public void  setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
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
        this.dateCreated.setyear(getdateCreated().getyear());
        this.dateCreated.StringtoIntmonth();
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualLnterestRate = annualInterestRate;
    }
    public double getAnnuallInterestRate(){
        return this.balance*this.annualLnterestRate;
    }
    public double getMonthlyInterestRate(){
        return annualLnterestRate/12;
    }
    public double getMonthlyInterest(){
       return ((balance*annualLnterestRate/100)/12);
    }
    public void withdraw(double amt){
        if(this.balance > amt){
            this.balance = this.balance-amt;
        }
        else{
            System.out.println("not have money enought to withdraw ");
        }
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
        this.setbalance(this.getbalance()-amt);
        acc.setbalance(acc.getbalance()+amt);
    }
    @Override
    public String toString(){
        return "account id = "+id+"\n balance = "+balance+"\n Date Created = "+dateCreated
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
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setdate(Date Birthdate){
        this.bDate = Birthdate;
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
    @Override
    public String toString(){
        return "Account Type: SavingAccount \n"+super.toString();
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
    @Override
    public String toString(){
        return "Account Type : Fixaccount\n"+super.toString();
    }
}


