/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programs;

/**
 *
 * @author Adolf K Weismann
 */
public class Floor_BS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] arr={1,2,5,6,9,14,16,18};
        int ans = floor(arr, 16);
        System.out.println(ans);
    }
    
    static int floor(int[] arr, int target)
    {
        if(target>arr.length-1)//what if taget is greater than last element
            return -1;
        int start = 0;
        int end = arr.length;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;                
            }
            else
                return mid;
        }
        return end;
    }
    
}
