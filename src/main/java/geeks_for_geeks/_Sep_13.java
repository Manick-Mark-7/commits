package geeks_for_geeks;

import java.util.Random;

public class _Sep_13 {

    public static void main(String[] args) {
        Random rand = new Random();
        int N =rand.nextInt(5);
       int  S =rand.nextInt(20);
        String str = findLargest(N,S);
        System.out.println("Input is :"+N+" "+S);
        System.out.println(str);
    }

    public static String findLargest(int N, int S) {
        StringBuilder sb = new StringBuilder();
        if(N==0 || (N>1 && S==0) || (N*9 <S)) return "-1";
        while(N>0){
            if(S>=9){
                sb.append("9");
                S-=9;
                N-=1;
            }
            else{
                sb.append(S);
                S=0;
                N-=1;
            }
        }
        return sb.toString();
    }
}
