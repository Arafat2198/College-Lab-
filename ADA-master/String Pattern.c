
int match(char A[],char B[])
{
  int n=strlen(A);
  int m=strlen(B);
  int i,j;
  int count=0;

  for(i=0;i<n-m;i++)
  {
     for(j=0;j<m;j++)
	if (A[i+j]!=B[j])
	break;

     if(m==j)
       {
	       printf("\nThe Pattern is found at Index Location : %d",i);
	       count++;
       }
  }
  return count;
}

int main()
{
  char A[]="ARAFATADNANALMASYOUSUFMANAL";
  char B[]="ALMAS";
  int count;
  clrscr();
  count = match(A,B);
  if(count==0)
   printf("\n\nSorry No Patterns Found");
   getch();
  return 0;
}
