import java.util.*;
import databank.savingsaccount;
import savings.accounts;

class united
{
  int time;
  public static void main(String[] args)
  {
    Scanner s =new Scanner(System.in);
    savingsaccount ob=new savingsaccount();
    System.out.println("\nEnter the Account Name:");
    ob.accountHolderName=s.next();
    System.out.println("\nEnter the Account Number:");
    ob.accountNumber=s.nextInt();
    System.out.println("\nEnter the Balance:");
    ob.balance=s.nextInt();
    System.out.println("\nEnter the address:");
    ob.address=s.next();
    ob.display();
    System.out.println("\nEnter The Rate Of Interest");
    ob.rateOfInterest=s.nextInt();
    System.out.println("\n\nEnter the Time period: ")
    time=s.nextInt();
    ob.withdrawl();
    ob.deposit();
    ob.calculateAmount(time);
    System.out.println("\nThe new Details are after adding Interest Withdrawl and Deposit is\n");
    ob.display();
  }
}
