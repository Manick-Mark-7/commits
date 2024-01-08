package src.main.java.ashhad.array;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K_Jan_08 {
    public int subarraySum(int[] nums, int k) {
        int count = 0,remove=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            remove = sum-k;
            count+=map.getOrDefault(remove,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
