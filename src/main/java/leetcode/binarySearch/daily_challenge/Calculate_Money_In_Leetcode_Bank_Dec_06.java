package leetcode.binarySearch.daily_challenge;

import java.util.Random;

public class Calculate_Money_In_Leetcode_Bank_Dec_06 {
    public static void main(String[] args) {
        int n = new Random().nextInt(20);
        int ans = totalMoney(n);
        System.out.println(ans);
    }

    public static int totalMoney(int n) {
        int weeks = n/7;
        int days = n%7;

        int total = (weeks*(weeks-1)/2)*7;
        total+=weeks*28;

        total+=(days*(days+1)/2)+(weeks*days);

        return total;
    }
}
