package leetcode.binarySearch;

import java.util.Arrays;
import java.util.Random;

public class _Sep_01 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10);
        int[] ans = countBits(n);
        System.out.println(n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }
}
