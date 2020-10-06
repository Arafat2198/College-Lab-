#include<stdlib.h>
#include<stdio.h>

void merge(int arr[],int l,int mid,int r)
{
  int i,j,k;
  int n1=mid-l+1;
  int n2=r-mid;

  int L[n1],R[n2];

  for(i=0;i<n1;i++)
     L[i]=arr[l+i];
  for(j=0;j<n2;j++)
     R[j]=arr[mid+1+j];

  i=0;
  j=0;
  k=l;

  while(i<n1 && j<n2)
  {
    if(L[i] <= R[j])
    {
      arr[k]=L[i];
      i++;
    }
    else
    {
      arr[k]=R[j];
      j++;
    }
    k++;
  }

    while(i<n1)
    {
      arr[k]=L[i];
      i++;
      k++;
    }

    while (j<n2)
    {
      arr[k]=R[j];
      j++;
      k++;
    }
}

void mergeSort(int arr[],int l,int r)
{
  if(l<r)
  {
    int mid=(l+(r-l))/2;
    mergeSort(arr,l,mid);
    mergeSort(arr,mid+1,r);
    merge(arr,l,mid,r);
  }
}

void printArray(int A[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", A[i]);
    printf("\n");
}

int main()
{
    int arr[] = {12, 11, 13, 5, 6, 7};
    int arr_size = sizeof(arr)/sizeof(arr[0]);

    printf("Given array is \n");
    printArray(arr, arr_size);

    mergeSort(arr, 0, arr_size - 1);

    printf("\nSorted array is \n");
    printArray(arr, arr_size);
    return 0;
}
