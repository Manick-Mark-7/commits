package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Rotate_Bits_Sep_20 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt((int)Math.pow(2,16));
        int D = rand.nextInt((int)Math.pow(10,5));
        System.out.println(N+" "+D);
        ArrayList<?> ans = rotate(N,D);
        System.out.println(ans.toString());
    }

    private static ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> list = new ArrayList<>();
        D%=16;
        list.add((N<<D | (N>>16-D))&65535);
        list.add((N>>D | (N<<16-D))&65535);

        return list;
    }
}
