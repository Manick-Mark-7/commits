package geeks_for_geeks;

import java.util.Arrays;
import java.util.Random;

public class _Sep_17 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10);
        long[] ans = printFibb(n);
        System.out.println(Arrays.toString(ans));
    }

    private static long[] printFibb(int n) {
        long[] ans = new long[n];
        ans[0] = 1;
        ans[1] = 1;
        for(int i=2;i<n;i++){
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans;
    }
}
