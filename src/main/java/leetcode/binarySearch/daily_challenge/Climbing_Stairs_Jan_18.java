package src.main.java.leetcode.binarySearch.daily_challenge;

public class Climbing_Stairs_Jan_18 {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i=0;i<n;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return b;

    }
}
