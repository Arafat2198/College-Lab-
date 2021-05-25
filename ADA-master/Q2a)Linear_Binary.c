#include<stdio.h>
#include<conio.h>
#include<time.h>
int linearsearch(int arr[], int n, int x)
{
    int i;
    for (i = 0; i < n; i++)
	if (arr[i] == x)
	    return i;
    return -1;
}
int binarysearch(int arr[], int n, int key)
{
    int beg = 0, end = n - 1, mid;

    while (beg <= end)
    {
	mid = (beg + end) / 2;

	if (arr[mid] == key) return 1;
	else if (arr[mid] > key) end = mid - 1;
	else beg = mid + 1;
    }
    return -1;
}

int main()
{
 clock_t start_t, end_t;
 double total_t;
 int arr[100];
 int i,n,c,ele,result;
 clrscr();

 printf("\nEnter the size of the array:");
 scanf("%d",&n);
 printf("\nEnter the elements in the Array:");
 for(i=0;i<n;i++)
  scanf("%d",&arr[i]);

 while(1)
 {
  printf("\n*****MAIN MENU*****\n");
  printf("1.Linear Search\n");
  printf("2.Binary Search\n");
  printf("3.exit\n");
  printf("\n*******************\n");
  printf("enter your choice:\n");
  scanf("%d",&c);
  printf("\n*******************\n");
 switch(c)
 {
   case 1:start_t = clock();
	        printf("Enter the ELement to be searched :");
	        scanf("%d",&ele);
	        result=linearsearch(arr,n,ele);
	        if(result==-1)
	        printf("\nThe ELement is not present!");
	        else
	        printf("\nThe Element is present!");
	        end_t = clock();
	        total_t = (double)end_t - start_t/CLOCKS_PER_SEC;
	        printf("\nTotal time taken by CPU: %f\n",total_t  );
	        break;

  case 2:start_t = clock();
	       printf("Enter the ELement to be searched :");
       	 scanf("%d",&ele);
	       result=binarysearch(arr,n,ele);
       	 if(result==-1)
       	  printf("\nThe ELement is not present!");
	       else
	       printf("\nThe Element is present!");
	       end_t = clock();
	       total_t = (double)end_t - start_t/CLOCKS_PER_SEC;
	       printf("\nTotal time taken by CPU: %f\n", total_t  );
	       break;
  case 3: exit(0);
}
}
  getch();
  return 0;
 }
