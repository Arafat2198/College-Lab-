import java.util.*;

class prime{
  public static void main(String args[])
  { Scanner s = new Scanner(System.in);
    int i,n,a,t=0,m=0;
    System.out.printf("Enter The Number of Prime numbers to be displayed: ");
     n=s.nextInt();

     for(a=1;;a++)
     {
       if(t==2)
      {
        System.out.println("\n\n"+a);
        m++;
      }
        if(m>=n)
      {
         break;
      }
      else t=0;

     for (i=a;i>0;i-- )
      {
          if (a==1)
          {
            t=t+2;
          }
          else if(a%i==0)
          {
            t++;
          }

      }
     }
 }
}
