#include<stdio.h>
#include<conio.h>
int binarySearch(int arr[10], int l, int r, int x)
{
    while (l <= r)
  {
      int m = (l+r)/2;
      if (arr[m] == x)
      return m;
      if (arr[m] < x)
      l = m + 1;
      else
      r = m - 1;
  }
    return -1;
}

int main()
{
  int arr[10],arr1[10],arr2[10];
  int n,i,j=0,p=1,ele,n1=0,n2=0,result;
  
  clrscr();
  
  printf("Enter the Size of the Array:");
  scanf("%d",&n);
  
  printf("Enter the elements in the Array ");
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    
  for(i=0;i<n;i++) // Loop to find the Pivot
    if(arr[i]<arr[i+1])
      p++;
    else break;

  for(i=0;i<n;i++) // Loop to split the Array into two separate arrays
    if(i<p)
     {
       arr1[i]=arr[i];
       n1++;    // n1 gives us the length of the array 1
     }
    else
     {
       arr2[j]=arr[i];
       n2++;    // n2 gives us the length of the array 2
       j++;
     }
     
  printf("\nArray 1:");  // Printing The Array 1
  for(i=0;i<n1;i++)
    printf("%d",arr1[i]);
    
  printf("\nArray 2:");   // Printing The Array 2
  for(i=0;i<n2;i++)
    printf("%d",arr2[i]);
    
  printf("\n\nEnter the element to be Searched :");
  scanf("%d",&ele);
  
  i=0;
  if(ele<arr1[i])
      result = binarySearch(arr2,0,n2-1,ele);
  else
      result = binarySearch(arr1,0,n1-1,ele);
      (result == -1) ? printf("\n\nElement is not present in array")
		   : printf("\n\nElement is present at index %d",result);
		   getch();
		   return 0;
}
