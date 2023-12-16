/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programs;

import java.util.Arrays;

/**
 *
 * @author Adolf K Weismann
 */
public class Bubble_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arr={2,5,6,10,12};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
               if(arr[j]<arr[j-1])
               {
                  int temp = arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  swapped=true;
               }
            }
            if(!swapped)
                break;
        }
    }
}
