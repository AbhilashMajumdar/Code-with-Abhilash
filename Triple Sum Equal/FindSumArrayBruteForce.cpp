#include<iostream>

using namespace std;

int main()
{
    int n=5;
    int arr[5]={1,2,3,4,5};
    int sum=8;

    for(int i=0; i<n-2; i++)
    {
        for(int j=i+1; j<n-1; j++)
        {
            for(int k=j+1; k<n; k++)
            {
                if((arr[i]+arr[j]+arr[k])==sum)
                {
                    cout<<arr[i]<<"\t"<<arr[j]<<"\t"<<arr[k];
                    cout<<"\n";
                }
            }
        }
    }
    return(0);
}