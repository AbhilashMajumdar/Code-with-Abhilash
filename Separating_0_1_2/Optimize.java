import java.util.*;
import java.io.*;

class Solution
{
    void separateArray()
    {
        int[] arr=new int[]{2,1,0,1,2,0,1,2,0,1};
        int n=10;
        
        System.out.println();
        int l=0;
        int m=0;
        int h=n-1;

        while(m <= h)
        {
            switch(arr[m])
            {
                case 0:
                        int temp=arr[l];
                        arr[l]=arr[m];
                        arr[m]=temp;
                        l++;
                        m++;
                        break;

                case 1:
                        m++;
                        break;

                case 2:
                        int temp1=arr[m];
                        arr[m]=arr[h];
                        arr[h]=temp1;
                        h--;
                        break;
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class Optimize
{
    public static void main(String[] args) {
        Solution s=new Solution();
        s.separateArray();
    }
} 