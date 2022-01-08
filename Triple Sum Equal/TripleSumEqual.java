import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class findSumArray
{
    void findSum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.print("Enter the sum : ");
        int sum=sc.nextInt();

        Collections.sort(arr);  //sorting the array in ascending order
        
        for(int i=0; i<n-2; i++)
        {
            int l=i+1; //using left pointer
            int r=n-1;  //using right pointer
            while(l<r)
            {
                int k=arr.get(i)+arr.get(l)+arr.get(r);
                if(k == sum)
                {
                    System.out.println(arr.get(i)+" "+arr.get(l)+" "+" "+arr.get(r));
                    l++;
                    r--;
                }
                else if(k<sum)
                {
                    l=l+1;
                }
                else
                {
                    r=r-1;
                }
            }
        }

    }
}

public class TripleSumEqual
{
    public static void main(String args[])
    {
        findSumArray f=new findSumArray();
        f.findSum();
    }
}