package geeks_for_geeks;

import java.security.SecureRandomSpi;
import java.util.Random;

public class _Sep_12 {
    public static void main(String[] args) {
        long N = new Random().nextLong(10);
        System.out.println(isPerfectNumber(N));
    }

    private static int isPerfectNumber(long N) {
        if(N==1) return 0;
        long sum = 1;
        for(long i=2;i<Math.sqrt(N);i++){
            if(N%i == 0)sum+=(i+(N/i));
        }
        return N==sum?1:0;
    }
}
