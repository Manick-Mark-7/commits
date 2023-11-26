package geeks_for_geeks;

import java.util.Random;

public class _Sep_11 {
    public static void main(String[] args) {
        int n = new Random().nextInt(50);
        System.out.println(isLucky(n)+" "+n);
    }

    private static boolean isLucky(int n) {
        for(int i=2;i<=n;i++){
            if(n%i == 0) return false;
            n = n-(n/i);
        }
        return true;
    }
}
