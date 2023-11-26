package ashhad.array;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}
