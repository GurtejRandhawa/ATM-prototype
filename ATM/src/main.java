import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice,custno,pswd,amt,balance=5000,wamt,choice2;
        System.out.println("***Welcome to Your Bank Interface***");
        
        while(true)
        {
        System.out.println("Press 1 for : Savings Account");
        System.out.println("Press 2 for : User Account Information");
        System.out.println("Press 3 for : Exit");
        choice=sc.nextInt();
        
        if(choice==1)
        {
            System.out.println("**Welcome to savings account**");
            System.out.println("Please Enter your Account Number");
            custno=sc.nextInt();
            System.out.println("Please Enter your Account Password");
            pswd=sc.nextInt();
            while(true)
            {
            	System.out.println();
                System.out.println();
             System.out.println("Press 1 for : Deposit Money");
             System.out.println("Press 2 for : Withdraw Money");
             System.out.println("Press 3 for : Check Balance");
             System.out.println("Press 4 for : Exit");
             choice2=sc.nextInt();
             if(choice2==1)
             {
                 System.out.println("Please Enter Deposit Amount");
                 amt=sc.nextInt();
                 System.out.println("Rs"+amt+" Added Successfully");
                 System.out.println();
                 balance=balance+amt;
                 System.out.println("Balance=Rs"+balance);
             }
             if(choice2==2)
             {
                 System.out.println("Please Enter Withdraw Amount");
                 wamt=sc.nextInt();
                 if(wamt>balance)
                     System.out.println("Sorry insufficient balance");
                 else
                 {
                     System.out.println(wamt);
                     System.out.println("Rs"+wamt+" Withdrawed successfully");
                     balance=balance-wamt;
                     System.out.println("Balance=Rs"+balance);
                 }
             }
             if(choice2==3)
             {
                 System.out.println("Balance=Rs"+balance);
             }
             if(choice2==4)
             {
                 break;
             }
            }
        }
        if(choice==2)
        {
            System.out.println("Account Holder's Name: GURTEJ SINGH RANDHAWA");
            System.out.println("Bank Name: State Bank Of India");
            System.out.println("Account Beneficiary: Kara Aujla");
            System.out.println("Savingds Account Balance:Rs "+balance);
            System.out.println();
            System.out.println();
        }
        if(choice==3)
        {
            System.out.println("**Thank You for using our services**");
            break;
        }
        }
        sc.close();
    }
    
}
