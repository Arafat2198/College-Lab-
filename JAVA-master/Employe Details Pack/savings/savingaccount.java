package savings;
import java.util.*;
import databank;

class savingsaccount extends accounts
{
  int rateOfInterest ;
  float Interest;
  int draw,dep;
  void calculateAmount(int time)
  {
    Interest = (balance*rateOfInterest*time);
    balance = (balance+Interest);
    balance = (balance+dep)-draw;
  }
  public abstract void withdrawl()
  {
    System.out.println("\n\nEnter the Withdrawl Amount: ");
    draw=s.nextInt();
  }

  public abstract void deposit()
  {
    System.out.println("\n\nEnter the Deposit Amount: ");
    dep=s.nextInt();
  }
  void display()
  {
      System.out.println("\nThe Account Details are:\n");
      System.out.println("The Name of the Account Holder: "+accountHolderName);
      System.out.println("The Account Number is: "+accountNumber);
      System.out.println("The Address is:"+address);
      super.display();
  }
}
