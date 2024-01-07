package src.main.java.ashhad.array;

public class Maximum_Product_SubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int ans  = maxProduct(nums);
        System.out.println(ans);
    }

    private static int maxProduct(int[] nums) {
        int pre = 1;
        int suf = 1;
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            if(pre==0) pre = 1;
            if(suf==0) suf=1;
            pre*=nums[i];
            suf*=nums[n-i-1];
            maxProduct = Math.max(maxProduct,Math.max(pre,suf));
        }
        return maxProduct;
    }
}
