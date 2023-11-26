package geeks_for_geeks;

import java.util.Random;

public class _Sep_18 {
    public static void main(String[] args) {
        long n = new Random().nextLong(100);
        System.out.println(isPowerofTwo(n));
    }

    private static boolean isPowerofTwo(long n) {
        int setBit =0;
        while(n>0){
            if((n&1)==1)
                setBit+=1;

            n = n>>1;
        }
        return setBit==1?true:false;
    }
}
