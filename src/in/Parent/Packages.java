package in.Parent;

import java.util.Scanner;
public class Packages {
    public String registration;
    public String Name;
    public String degree;
    private double cgpa;
    private int room_no;
    int backlogs;
    private int banknumber;
    private double balance;
    private String accountnumber;

    public  Packages(int banknumber, double balance, String accountnumber){
        this.banknumber = banknumber;
        this.balance = balance;
        this.accountnumber = accountnumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bank Details{");
        sb.append("banknumber=").append(banknumber);
        sb.append(", balance=").append(balance);
        sb.append(", accountnumber='").append(accountnumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void deposit(double money){
        if(money<=0){
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
            System.out.println("Rs " + money + "is added to your account " + accountnumber + ", cuurent balance is: " + balance);
        }
    }
    public void withdraw(double money){
        if(balance >= money){
            balance -= money;
            System.out.println("Rs "+money+" is withdrawn from your account "+accountnumber + ", cuurent balance is: " + balance);
        } else if (balance < money) {
            money = balance;
            balance =0;
            System.out.println("You don't have sufficient balance to withdraw the given amount "+money+" . You are poor! Withdrawn the full balance from the account");
        }
    }

    public Packages(){
    }
    public String getinfo(){
        return registration;
    }
    public void setinfo(String registration, String Name, String degree, double cgpa, int room_no, int backlogs){
        this.registration = registration;
        this.Name = Name;
        this.degree = degree;
        this.cgpa = cgpa;
        this.room_no = room_no;
        this.backlogs = backlogs;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Details : ");
//        sb.append("Registration Number: ").append(registration).append("\\");
//        sb.append("Name: ").append(Name).append("\\");
//        sb.append("Degree: ").append(degree).append("\\");
//        sb.append("cgpa: ").append(cgpa).append("\\");
//        sb.append("Room No: ").append(room_no).append("\\");
//        sb.append("Backlogs").append(backlogs).append("\\");
//        return sb.toString();
//    }
}
