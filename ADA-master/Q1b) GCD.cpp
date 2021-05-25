#include <iostream>
using namespace std;

int gcd(int m,int n)
{
   if(n==0) 
     return m;
   else
     return gcd(n,m%n);
}

int main()
{
   int t;
   cout<<"Enter the number of test cases:";
   cin>>t;
   while(t)
   {
   int m,n;
   cout<<"Enter the two Numbers";
   cin>>m>>n;
   int a=gcd(m,n);
   cout<<"The GCD of the two Numbers is :"<<a;
   t--;
   }
   return 0;
}

