package src.main.java.leetcode.binarySearch.daily_challenge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueue_Feb_14 {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int pos1 = 0;
        int pos2 = 0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>0){arr[pos1++] = arr[i];}
          else arr[pos2++] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
