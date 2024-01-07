package leetcode.binarySearch;

import java.util.Random;

public class _Aug_21 {
    public static void main(String[] args) {
        int n = new Random().nextInt(100);
        System.out.println(n+" "+convertToTitle(n));
    }

    private static String convertToTitle(int n) {
        if(n<27){
            return Character.toString((char)('A'+(n-1)%26));
        }
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%26 == 0){
                sb.append((char)('A'+25));
                n-=1;
            }
            else
                sb.append((char)('A'+(n%26)-1));
            n/=26;

        }
        return sb.reverse().toString();
    }

}
