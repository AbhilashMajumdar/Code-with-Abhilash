import java.util.ArrayList;

class Solution{
    
    public static void main(String args[]) 
    {
        Solution s=new Solution();
        s.arrangeNegative();
    }

    void arrangeNegative()
    {
        int[] arr=new int[]{1,2,-1,5,-2,3,-4,8,4,-3};
        int n=10;

        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0; i<10; i++)
        {
            a.add(arr[i]);
        }

        int l=0;
        int r=n-1;

        while(l<=r)
        {
            while(a.get(l)<0)
            {
                l++;
            }
            while(a.get(r)>=0)
            {
                r--;
            }
            if(l<=r)
            {
                int temp=a.get(l);
                a.set(l, a.get(r));
                a.set(r, temp);
                l++;
                r--;
            }
        }

        System.out.println(a);
    }
}