package src.main.java.leetcode.binarySearch.daily_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_Duplicates_Jan_14 {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<m;i++){
            if(set.contains(Arrays.toString(matrix[i]))) ans.add(i);
            else set.add(Arrays.toString(matrix[i]));
            //   System.out.println(set.toString());
        }

        return ans;
    }
}
