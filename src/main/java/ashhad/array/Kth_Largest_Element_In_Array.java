package ashhad.array;

import java.util.PriorityQueue;

public class Kth_Largest_Element_In_Array {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k=2;
        int ans = findKthLargest(nums,k);
        System.out.println(ans);
    }

    protected  static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (a-b));
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k) pq.poll();
        }

        return pq.peek();
    }
}
