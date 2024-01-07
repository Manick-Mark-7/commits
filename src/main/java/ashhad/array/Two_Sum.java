package ashhad.array;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(ans);
    }

    private static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == (nums[i] + nums[j]))
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
