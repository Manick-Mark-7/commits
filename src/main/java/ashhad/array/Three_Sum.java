package ashhad.array;

import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int target = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    set.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                }
                else if(sum<target)
                    j++;
                else k--;
            }
        }
        list.addAll(set);
        return list;
    }
}
