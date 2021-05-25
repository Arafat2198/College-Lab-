#include<stdio.h>
#include<conio.h>

int GCD(int m,int n)
{
  if(m==0)
   return n;

  if(n==0)
   return m;

  if(m==n)
   return m;

  if(m>n)
   return GCD(m-n,n);
  return GCD(m,n-m);
}
int main()
{
  int m,n;
  clrscr();
  printf("Enter the Two Numbers : ");
  scanf("%d %d",&m,&n);
  printf("\n\nThe GCD of %d and %d is : %d",m,n,GCD(m,n));
  getch();
  return 0;
}
