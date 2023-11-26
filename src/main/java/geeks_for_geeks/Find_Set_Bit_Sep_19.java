package geeks_for_geeks;

import java.util.Random;

public class Find_Set_Bit_Sep_19 {
    public static void main(String[] args) {
        int n = new Random().nextInt((int) Math.pow(10,8));
        int ans = getFirstSetBit(n);
        System.out.println(n+" "+ans);
    }

    private static int getFirstSetBit(int n) {
        if(n==0) return 0;
        if(n%2==1) return 1;
        int count = 1;
        int temp = n;
        while(temp%2==0){
            count+=1;
            temp = temp >> 1;
        }

        return count;
    }

}
