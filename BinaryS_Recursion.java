package Programs;

/* Recurrence relation:
   F(n)=O(1)+F(n/2)
   O(1)-Comparisons we made.
   F(n/2)-For dividing in two parts.
 */
public class BinaryS_Recursion {
    public static void main(String[] args) {
        int[]arr ={3,5,8,10,12,15};
        int target=12;
        int start=0,end=arr.length-1;
        System.out.println(bs(arr,target,start,end));
    }
    static int bs(int[] arr,int target,int start,int end)
    {
        if(start>end)
            return -1;
        int mid=start +(end-start)/2;
        if(arr[mid]==target) {
            return mid;
        }
        if(target<arr[mid]) {
            return bs(arr, target, start, mid - 1);
        }
            return bs(arr,target,mid+1,end);
    }
}
