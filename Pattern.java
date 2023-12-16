package Programs;

public class Pattern {
    public static void main(String[] args) {
        int n=5;
        pattern6(4);

    }
    static void pattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        int c=n;
        for(int row=1;row<=n*2;row++)
        {
            if(row>n)
            {
                for(int coll=1;coll<c;coll++)
                {
                    System.out.print("*");
                }c--;
            }
            else {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
            }
                System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int row=1;row<=n*2;row++)
        {
            int totalcols = row>n?2*n-row:row;
            int spaces = n-totalcols;
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<totalcols;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 1; row <=n; row++) {
            int spaces = n - row;
            for (int sp = 1; sp <=spaces; sp++) {
                System.out.print(" ");
            }
            for (int j = row; j >=1;j--) {
                System.out.print(j);
            }
                for (int j = 2; j <=row; j++) {
                    System.out.print(j);
                }
            System.out.println();
        }
    }
    // IMPORTANT PATTERN
    static void pattern6(int n) {
        int originaln=n;
        n=2*n;
        for (int row = 0; row <=n; row++) {
            for(int col=0;col<=n;col++)
            {
                int lowestindex=originaln-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(lowestindex);
            }
            System.out.println();
        }
    }
}
