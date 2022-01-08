import java.util.Scanner;
import java.util.ArrayList;

class findSolution
{
    void arrangeOddEven()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements ");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.print("Enter array elements ");
        for(int i=0; i<n; i++)
        {
            arr.add(sc.nextInt());
        }

        int l=0;
        int r=n-1;

        while(l<r)
        {
            while(arr.get(l)%2!=0)
            {
                l++;
            }
            while(arr.get(r)%2==0)
            {
                r--;
            }
            if(l<r)
            {
                int temp=arr.get(l);
                arr.set(l, arr.get(r));
                arr.set(r, temp);
                l++;
                r--;
            }
        }

        for(int j=0; j<n; j++)
        {
            System.out.print(arr.get(j)+" ");
        }
    }
}

class Opti
{
    public static void main(String args[])
    {
        findSolution f=new findSolution();
        f.arrangeOddEven();
    }
}