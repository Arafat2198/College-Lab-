import java.util.*;
import cie.*;
import see.external;

class united{

  public static void main(String[] args) {
    int n,i;
    Scanner s=new Scanner(System.in);
    System.out.printf("\nEnter the total number of Students: ");
    n=s.nextInt();
    student ob1[]=new student[n];
    internal ob2[]=new internal[n];
    external ob3[]=new external[n];
    for(i=0;i<n;i++){
      ob1[i]=new student();
      ob2[i]=new internal();
      ob3[i]=new external();
      System.out.printf("\n Enter the USN:");
      ob1[i].usn=s.nextInt();
      System.out.printf("\n Enter the Name:");
      ob1[i].name=s.next();
      System.out.printf("\n Enter the Semester:");
      ob1[i].sem=s.next();
      System.out.printf("\n Enter the CIE marks:");
      ob2[i].cie_marks[i]=s.nextInt();
      System.out.printf("\n Enter the SEE marks:\n");
      ob3[i].see_marks[i]=s.nextInt();
    }
    for (i=0;i<n;i++){
      System.out.println("\nThe USN of Student is :" +ob1[i].usn);
      System.out.println("\nThe Name of Student is :"+ob1[i].name);
      System.out.printf("\nThe Semester is :"+ob1[i].sem);
      System.out.printf("\nThe CIE marks are :"+ob2[i].cie_marks[i]);
      System.out.printf("\nThe SEE marks are :"+ob3[i].see_marks[i]);
    }
  }
}
