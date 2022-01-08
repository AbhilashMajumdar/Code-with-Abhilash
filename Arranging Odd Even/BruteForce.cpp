#include<iostream>
#include<vector>

using namespace std;

int main()
{
    int arr[6]={1,2,3,4,5,6};
    int n=6;
    vector<int> even;
    vector<int> odd;
    for(int i=0; i<n; i++)
    {
        if(arr[i]%2==0)
        {
            even.push_back(arr[i]);
        }
        else
        {
            odd.push_back(arr[i]);
        }
    }
    for(int j=0; j<even.size(); j++)
    {
        odd.push_back(even[j]);
    } 
    
    for(int k=0; k<n; k++)
    {
        arr[k]=odd[k];
    }
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return(0);
}