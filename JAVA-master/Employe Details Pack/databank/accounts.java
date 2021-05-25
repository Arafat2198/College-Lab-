package databanks;
import java.util.*;
class accounts
{
  public int balance ;
  public int accountNumber;
  public String accountHolderName ;
  public String address;

  public abstract void withdrawl()
  {}
  public abstract void deposit()
  {}
  public void display()
  {
     System.out.println("The Balance is :"+balance);
  }
}
