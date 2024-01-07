package src.main.java.ashhad.array;

public class Container_With_Most_Water {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0,right = height.length - 1;
            int maxArea = 0,minHeight;
            while(left < right){
                minHeight = Math.min(height[left],height[right]);
                maxArea = Math.max(maxArea , minHeight * (right - left));

                while(left < right && height[left] <= minHeight)
                    left++;
                while(left < right && height[right] <= minHeight)
                    right--;
            }
            return maxArea;
        }
    }
}
