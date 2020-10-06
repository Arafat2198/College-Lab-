import java.util.*;
class personal
{
  public String name;
  public int age;
  public String department;
}

class student extends personal
{
  public double cgpa;
}

class faculty extends personal
{
  public int no_publications;
}

class united
{
  static void display1(student t)
  {
    System.out.println("\nThe name of the Student is : "+t.name);
    System.out.println("The age of the Student is : "+t.age);
    System.out.println("The Department name is : "+t.department);
    System.out.println("The total publications are:"+t.cgpa);
  }

  static void display2(faculty t)
  {
    System.out.println("\nThe name of the Faculty is : "+t.name);
    System.out.println("The age of the Faculty is : "+t.age);
    System.out.println("The Department name is : "+t.department);
    System.out.println("The total publications are:"+t.no_publications);
  }

  static void input1(student t)
  {     Scanner s = new Scanner(System.in);
      System.out.println("\nEnter the name of the Student: ");
      t.name=s.next();
      System.out.println("Enter the age of the Student: ");
      t.age=s.nextInt();
      System.out.println("Enter the department of the Student");
      t.department=s.next();
      System.out.println("Enter the CGPA of the Student");
      t.cgpa=s.nextDouble();
  }

  static void input2(faculty t)
  {     Scanner s = new Scanner(System.in);
      System.out.println("\nEnter the name of the Faculty: ");
      t.name=s.next();
      System.out.println("Enter the age of the Faculty: ");
      t.age=s.nextInt();
      System.out.println("Enter the department of the Faculty: ");
      t.department=s.next();
      System.out.println("Enter the Total Publications of the Faculty: ");
      t.no_publications=s.nextInt();
  }


  public static void main(String[] args)
  {   Scanner si = new Scanner(System.in);
    int i,n,m;
    int low,max;
    System.out.println("Enter the total number of students\n");
    n=si.nextInt();
    System.out.println("Enter the total number of faculty\n");
    m=si.nextInt();
    student s[]= new student[n];
    faculty f[]= new faculty[m];
    System.out.println("\n**********************************************\n");
    System.out.println("\nEnter the Student Details\n");
    for (i=0;i<n;i++ )
    {
      s[i]=new student();
        input1(s[i]);
    }
    System.out.println("\n**********************************************\n");
    System.out.println("\nEnter the Faculty Details\n");
    for (i=0;i<m;i++)
    {
      f[i]=new faculty();
        input2(f[i]);
    }
    System.out.println("\n**********************************************\n");
    System.out.println("The Student Details are: \n");
    for(i=0;i<n;i++)
    {
      display1(s[i]);
    }
    System.out.println("\n**********************************************\n");
    System.out.println("The Faculty Details are: \n");
    for(i=0;i<n;i++)
    {
      display2(f[i]);
    }
    low=s[0].age;
    for (i=0;i<n;i++ )
    {
      if(low>s[i].age)
        {
          low=s[i].age;
        }
    }
    max=f[0].no_publications;
    for(i=0;i<m;i++)
    {
      if(max<f[i].no_publications)
      {
        max=f[i].no_publications;
      }
    }
    System.out.println("\n\nThe Youngest Student is : "+low);
    System.out.println("The Faculty with the most Publications is : "+max);
  }
}
