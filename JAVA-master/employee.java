import java.util.*;
class EMPLOYEE
{
  public int empno;
  public String name;
}

class REGULAR extends EMPLOYEE
{
  public int regular_pay;
}

class OVERTIME extends REGULAR
{
  public int addn_pay;
  OVERTIME(int a,String b,int c,int d)
  {
    empno=a;
    name=b;
    regular_pay=c;
    addn_pay=d;
  }
  int pay_sum()
  {
    return (regular_pay+addn_pay);
  }
}

class united
{

  public static void main(String[] args)
  {
    int n,i;
    int a,c,d;
    String b;
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the total number of Employees");
    n=s.nextInt();
    OVERTIME t[] = new OVERTIME[n];
    for(i=0;i<n;i++)
    {

      System.out.println("\nEnter the Employee no: ");
      a=s.nextInt();
      System.out.println("Enter the Employee Name: ");
      b=s.next();
      System.out.println("Enter the Regular Pay");
      c=s.nextInt();
      System.out.println("Enter the Additional Pay");
      d=s.nextInt();
      t[i]=new OVERTIME(a,b,c,d);
    }
    System.out.println("\n************************************");
    System.out.println("\nThe Employee details are\n");
    for(i=0;i<n;i++)
        display(t[i]);
  }

static void display(OVERTIME t)
   {
     System.out.println("The employee Number: "+t.empno);
     System.out.println("The employee Name: "+t.name);
     System.out.println("The total salary: " +t.pay_sum() +"\n");
   }
}
