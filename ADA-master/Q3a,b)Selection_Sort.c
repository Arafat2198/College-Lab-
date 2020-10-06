#include <stdio.h>
#include <time.h>
#include <stdlib.h>

void swap(int *xp, int *yp) 
{ 
    int temp = *xp; 
    *xp = *yp; 
    *yp = temp; 
} 

void selectionsort(int arr[], int n) 
{ 
    int i, j, min; 
    for (i = 0; i < n-1; i++) 
    {  
        min= i; 
        for (j = i+1; j < n; j++) 
          if (arr[j] < arr[min]) 
            min = j;   
        swap(&arr[min], &arr[i]); 
    } 
} 

void klargest(int a[],int n,int k)
{
 int i;
 printf("Largest elements");
 for(i=n-1;i>n-k-1;i--)
 {
  printf(" %d ",a[i]);
 }
}

int main()
{
 clock_t start_t, end_t;
 double total_t;
 int arr[100];
 int i,n,c,k;
 
 printf("enter the size of the array\n");
 scanf("%d",&n);
 for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
 printf("\n*****MAIN MENU*****\n");
 printf("1.Selection sort\n");
 printf("2.Print Largest Elements\n"); 
 printf("3.exit\n");
 printf("\n*******************\n");
 printf("enter your choice:\n");
 scanf("%d",&c);
 printf("\n*******************\n");
 switch(c)
 {case 1:start_t = clock();
         selectionsort(arr,n);
         printf("the sorted array\n");
         for(i=0;i<n;i++)
          printf("%d \n",arr[i]);
         break;
         end_t = clock();
         total_t = (double)end_t - start_t/CLOCKS_PER_SEC;
  case 2:printf("Enter the Number of largest elements to be printed");
          klargest(arr,n,k);
          break;      
  case 3: exit(0);}               
 printf("Total time taken by CPU for selection sort: %f\n", total_t  ); 
 return 0;
}
