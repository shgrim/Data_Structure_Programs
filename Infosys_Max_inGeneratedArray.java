package Programs;

public class Infosys_Max_inGeneratedArray {
    public static void main(String[] args) {
        int n=7;
        System.out.println(generate(n));

    }
    static int generate(int n)
    {
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int a=arr[0];
        for(int i=1;i<=n;i++)
        {
            if(2<=2*i&&2*i<=n)
          {
               arr[2*i]=arr[i];
           }
           if(2<=2*i+1&&2*i+1<=n)
            {
                arr[2*i+1]=arr[i]+arr[i+1];
            }
        }
        for(int j=1;j<=n;j++)
        {
            if(arr[j]>a)
            {
                a=arr[j];
            }

        }return a;
    }
}