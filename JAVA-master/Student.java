import java.util.*;
import java.lang.*;
class Student
 {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[10];
    int credits[] = new int[10];
    String name, usn;
    double sgpa;
    int credit_subject[] = new int[10];
    int i, sum_credits, sum_credits_earned;
    public void accept(int n){
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter USN");
        usn = sc.next();
        System.out.println("Enter Marks");
        for(i=0; i<n; i++){
            marks[i] = sc.nextInt();
            }
        System.out.println("Enter Credits");
        for(i=0; i<n; i++){
            credits[i] = sc.nextInt();
            }
        }
    public void calculate(int n){
        for(i=0; i<n; i++){
            if(marks[i]>=90){
                credit_subject[i] = credits[i]*10;
            }
            else if(marks[i]<90 && marks[i]>=75){
                credit_subject[i] = credits[i]*9;
            }
            else if(marks[i]<75 && marks[i]>=60){
                credit_subject[i] = credits[i]*8;
            }
            else if(marks[i]<60 && marks[i]>=50){
                credit_subject[i] = credits[i]*7;
            }
            else if(marks[i]<50 && marks[i]>=45){
                credit_subject[i] = credits[i]*6;
            }
            else if(marks[i]<45 && marks[i]>=40){
                credit_subject[i] = credits[i]*5;
            }
            else{
                credit_subject[i] = credits[i]*0;
            }
        }
        for(i=0; i<n; i++){
            sum_credits += credits[i];
            sum_credits_earned += credit_subject[i];
        }
        sgpa = sum_credits_earned/sum_credits;
    }
    public void display()
    {
        System.out.println("Name-" + name +"\nUSN-" + usn +"\nsgpa-" + sgpa);
    }
    public static void main(String args[])
    {   int n;
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the total number of Subjects: ");
        n=a.nextInt();
        Student s =new Student();
        s.accept(n);
        s.calculate(n);
        s.display();
    }
}



