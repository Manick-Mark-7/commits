package leetcode.binarySearch;

import java.util.Arrays;

public class Min_Op_To_Reduce_to_0_Sep_20 {
    public static void main(String[] args) {
        int[] nums  = {1,1,4,2,3};
        int x = 5;
        int ans =  minOperations(nums,x);
        System.out.println(ans);
    }

    private static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = Arrays.stream(nums).sum();
        int target = totalSum - x;
        if(target<0) return -1;
        if(target == 0) return n;

        int minOperations = Integer.MAX_VALUE;
        int currentSum = 0,leftIdx = 0 , rightIdx = 0;

        while(rightIdx<n){
            currentSum+=nums[rightIdx++];
            while(currentSum > target && leftIdx < n){
                currentSum-=nums[leftIdx++];
            }
            if(currentSum == target)
                minOperations = Math.min(minOperations,n-(rightIdx-leftIdx));
        }
        return(minOperations == Integer.MAX_VALUE) ? -1 : minOperations;
    }
}
