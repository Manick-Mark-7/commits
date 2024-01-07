package ashhad.array;

public class Maximum_SubArray_Jan_07 {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:nums){
            sum+=i;
            if(sum>maxSum) maxSum = sum;
            sum = sum<0?0:sum;
        }
        return maxSum;
    }
}
