package src.main.java.leetcode.binarySearch.daily_challenge;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_Feb_12 {
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        int ans = majorityElement(num);
    }

    private static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)>(n/2)) return i;
        }
        return 0;
    }
}
