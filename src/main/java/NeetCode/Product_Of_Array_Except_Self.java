package NeetCode;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        System.out.println(Arrays.toString(ans));
        int curr = 1;
        for(int i=0;i<n;i++){
            ans[i]*=curr;
            curr*=nums[i];
        }
        System.out.println(Arrays.toString(ans));
        curr = 1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=curr;
            curr*=nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
