#include<stdio.h>
#include<conio.h>

void position(int arr[],int n)
{
  int arr2[20], pos[20];
  int i,j,temp,k=0;
  for(i=0;i<n;i++)                  // Copying the Original array in a new array
     arr2[i]=arr[i];

  for (i = 0; i < n-1; i++)        // Bubble Sorting
   for (j = 0; j < n-i-1; j++)
    if (arr[j] > arr[j+1])
     {
       temp=arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp;
     }

  i=0;
  while(i<n)                   // Finding the positions changed
       {
         if(arr2[i]!=arr[i])
            {
              pos[k]=i;
              k++;
            }
         i++;
       }
  printf("\n\nThe Index Positions that have been changed after sorting are: ");
  for(i=0;i<k;i++)
     printf("%d ",pos[i]);
}

int main()
{
  int arr[20],n,i;
  printf("\nEnter The Size of the array :");
  scanf("%d",&n);
  printf("\nEnter the elements in the array :");
  for(i=0;i<n;i++)
     {
       scanf("%d",&arr[i]);
     }
  position(arr,n);
  return 0;
}
