package Programs;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr={4,6,8,7,5,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp =arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }

    }
}
