#include<stdio.h>
#include<conio.h>

int fib(int n)
{
  int f[n+2];
  int i;

  f[0] = 0;
  f[1] = 1;

  for (i = 2; i <= n; i++)
  {
      f[i] = f[i-1] + f[i-2];
  }
  return f[n];
}

int main ()
{
  int n,i=0,max,t,f[100];
  printf("Enter the Length of the Array :");
  scanf("%d\n",&n);
  for(i=0;i<n;i++)
     {
       f[i]=fib(i);
     }
  for(i=0;i<=n/2;i++)
     {
      if((n-1)%f[i]==0)
        {
          max=f[i];
        }
      else continue;
     }
  printf("The man should take steps of %d units to reach the end of the array !!",max);
  return 0;
}
