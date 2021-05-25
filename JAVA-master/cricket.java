import java.util.*;
abstract class PLAYER
{
  String name;
  int matches_played;
  int average;
  abstract void cal_average(String si,int m);
}

class BATSMAN extends PLAYER
{
  int runs_scored;
  void cal_average(String si,int m)
  { Scanner s = new Scanner(System.in);
    name=si;
    matches_played=m;
    System.out.println("\nEnter the number of runs scored\n");
    runs_scored=s.nextInt();
    average=runs_scored/matches_played;
    System.out.println("\n\nThe name of the player is :"+si);
    System.out.println("The average is :"+average);
  }
}

class BOWLER extends PLAYER
{
  int runs_given;
  void cal_average(String si,int m)
  { Scanner s = new Scanner(System.in);
    name=si;
    matches_played=m;
    System.out.println("\nEnter the number of runs conceded\n");
    runs_given=s.nextInt();
    average=runs_given/matches_played;
    System.out.println("\n\nThe name of the player is :"+si);
    System.out.println("The average is :"+average);
  }
}

class united
{
  public static void main(String[] args)
  {
    String nm;
    int m,mt,n,i,mp;
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the total number of batsmen\n");
    m=s.nextInt();
    System.out.println("\nEnter the total number of bowlers");
    n=s.nextInt();
     BATSMAN b[] = new BATSMAN[m];
     BOWLER  c[] = new BOWLER[n];
     for(i=0;i<m;i++)
     {
        System.out.println("Enter The Name of the Batsmen:");
        nm=s.next();
        System.out.println("Enter the number of matches played:");
        mt=s.nextInt();
        b[i]=new BATSMAN();
        b[i].cal_average(nm,mt);
     }
     for(i=0;i<n;i++)
     {
        System.out.println("\nEnter The Name of the Bowler:");
        nm=s.next();
        System.out.println("\nEnter the number of matches played:");
        mt=s.nextInt();
        c[i]=new BOWLER();
        c[i].cal_average(nm,mt);
     }
  }
}
