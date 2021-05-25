#include <stdio.h>
#include <stdlib.h>
#include <time.h>


void insertionSort(int arr[], int n) {  
    int i, key, j;  
    for (i = 1; i < n; i++) {  
        key = arr[i];  
        j = i - 1;  
  
        while (j >= 0 && arr[j] > key) {  
            arr[j + 1] = arr[j];  
            j = j - 1;  
        }  
        arr[j + 1] = key;  
    }  
}  

int main() {

    clock_t start_t, end_t;
    double total_t;
    printf("Enter the Array size :"); 
    int n;
    int arr[100];
    scanf("%d",&n);
    for (int i = 0; i < n; ++i) 
    scanf("%d",&arr[i]);
    insertionSort(arr, n);
    for (int i = 0; i < n; ++i) 
    printf("%d",arr[i]);
    printf("\n");
    end_t = clock();
    total_t = (double)end_t - start_t/CLOCKS_PER_SEC;
    printf("Total time taken by CPU for selection sort: %f\n", total_t  ); 
    return 0;
}
