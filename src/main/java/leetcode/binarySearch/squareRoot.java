package leetcode.binarySearch;

import java.util.Random;

public class squareRoot {
    public static void main(String[] args) {
        int x = new Random().nextInt(20);
        System.out.println(x);
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {

        int low = 1;
        int mid = -1;
        int high = x;

        while(low<=high){
            mid = low + (high-low)/2;
            if((mid*mid)>x)
                high = mid-1;
            else if((mid*mid) == x)
                return mid;
            else
                low = mid + 1;
        }
        return Math.round(high);
    }
}
