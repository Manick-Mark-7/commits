package NeetCode.TwoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height =  {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        while(left<right){
            int containerLength = right - left;
            int area = containerLength*Math.min(height[left],height[right]);
            ans = Math.max(ans,area);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return ans;
    }
}
