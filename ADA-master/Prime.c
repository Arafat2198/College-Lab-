#include <stdio.h>
#include <conio.h>
#include <time.h>

int main()
{
  int n,i,j,count,temp=0;
  clrscr();
  printf("\nEnter the Number of Prime numbers to be generated: ");
  scanf("%d\n\n",&n);
  for(i=1;;i++)
     {
       count=0;
       for(j=1;j<i;j++)
       {
	      if(i%j==0)
		      count++;
       }

       if(count<2)
       {
	      printf("%d ",i);
	      temp++;
       }
       if(temp==n)
		break;
     }
  getch();
  return 0;
}
