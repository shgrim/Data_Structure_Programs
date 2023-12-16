/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programs;

import java.util.Scanner;

/**
 *
 * @author Adolf K Weismann
 */
public class BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr={1,2,5,6,9,14,16,18};
        int ans = binarysearch(arr, t);
        System.out.println(ans);
    }
    
    static int binarysearch(int[] arr, int target)
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
        return -1;
    }
}
