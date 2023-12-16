/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programs;

/**
 *
 * @author Adolf K Weismann
 */
public class Ceiling_BS {
    public static void main(String[] args)
    {
        int[] arr={1,2,5,6,9,14,16,18};
        int ans = ceiling(arr, 16);
        System.out.println(ans);
    }
    
    static int ceiling(int[] arr, int target)
    {
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
        return start;
    }
}
