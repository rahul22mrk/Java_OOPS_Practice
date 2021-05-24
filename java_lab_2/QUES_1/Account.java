package java_lab_2.QUES_1;

import java.util.Scanner;

public class Account {
    private String accountHolder;
    private int accountNumber;
   
    private String address;
    private String accountType;
    private int currentBallance;
    public Account(String accountHolder,int accountNumber,int ammount)
    {
      this.accountHolder=accountHolder;
      this.accountNumber=accountNumber;
      this.currentBallance=ammount;
    }
    public Account(String accountHolder,int accountNumber,String address,String accountType,int currentBalance)
    {
        this.accountHolder=accountHolder;
      this.accountNumber=accountNumber;
      this.address=address;
      this.accountType=accountType;
      this.currentBallance=currentBalance;
    }
    public void deposit(int dept)
    {
        currentBallance=currentBallance+dept;
        System.out.println(dept+" Amount Deposited to Your Account");
        
        
    }
    public void withdraw(int withD)
    {
        this.currentBallance=this.currentBallance-withD;
        System.out.println(withD+" Ammount WithDrawn From Your Account Successfully");
        
    }
    public void getBalance()
    {
        System.out.println("\n\n****************************************************************\n\n"+"Account Holder Name : "+accountHolder+"\nAcoount Number is : "+accountNumber+"\nAccount Type is : "+accountType+"\nCurrent Ballance is "+currentBallance);
    }
    
    public static void main(String []args)
    {
        Account ac=new Account("XYZ AB",100359865,"xyz city Madhya-Pradesh 102","Saving Account",1000);
       ac.getBalance();
      System.out.print("Enter Deposit ammount ");
       Scanner sc=new Scanner(System.in);
        int depositAmmount=sc.nextInt();
       
       ac.deposit(depositAmmount);
       
             System.out.print("Enter Withdraw ammount ");
      
        int withDraw=sc.nextInt();
       
       ac.deposit(withDraw);
       ac.getBalance();
    }
}
