package leetcode.binarySearch.daily_challenge;

public class Number_Of_One_Bits_Nov_29 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }

    private static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count+=1;
        }
        return count;
    }


}
