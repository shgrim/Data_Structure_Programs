package Programs;

public class geeks {
    public static void main(String[] args) {
        long[] X={2, 1, 6},Y ={1, 5};
        System.out.println(countPairsBruteForce(X,Y));
    }
    public static long countPairsBruteForce(long[] X, long[] Y)
    {
        long ans = 0;
        for (int i = 0; i < X.length; i++)
            for (int j = 0; j < Y.length; j++)
                if (Math.pow(X[i], Y[j]) > Math.pow(Y[j], X[i]))
                    ans++;
        return ans;
    }
}
