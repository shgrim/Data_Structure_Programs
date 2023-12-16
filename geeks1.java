package Programs;

import java.util.ArrayList;

public class geeks1 {
    public static void main(String[] args) {
        int arr[]={7,5,7,1};
        int n=4;
        int k=3;
        System.out.println(missing(arr,n,k));
    }
    static int missing(int arr[],int n,int k)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int j=0;j<=max;j++)
        {
            for(int t=0;t<n;t++)
            {
                if(j!=arr[t])
                {
                    arr1.add(j);
                }
            }
        }
        return arr1.get(k);
    }
}
