#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

void swap(int* a, int* b)
{
    int t = *a;
    *a = *b;
    *b = t;
}

int partition (int A[],int l,int h)
{
  int i=l,j=h;
  int pivot=A[l];
  while(i<=j)
  {
    do
    {
      i++;
    } while(A[i]<=pivot);

    do
    {
      j--;
    } while(A[j]>pivot);

    if(i<j)
      swap(&A[i],&A[j]);
  }
  swap(&A[j],&pivot);
}

int quicksort(int A[],int l,int h)
{
  int j;
  if(l<h)
  {
    j=partition(A,l,h);
    quicksort(A,l,j);
    quicksort(A,j+1,h);
  }
}

void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("n");
}


int main()
{
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr)/sizeof(arr[0]);
    quicksort(arr, 0, n-1);
    printf("Sorted array: n");
    printArray(arr, n);
    getch();
    return 0;
}
