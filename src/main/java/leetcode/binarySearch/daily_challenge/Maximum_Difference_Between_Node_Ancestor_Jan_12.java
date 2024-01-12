package src.main.java.leetcode.binarySearch.daily_challenge;

import leetcode.binarySearch.daily_challenge.Find_Largest_Value_In_Each_Tree_Row_Oct_24;

public class Maximum_Difference_Between_Node_Ancestor_Jan_12 {
    int maxVal;
    int minVal;
    int diff = 0;
    public int maxAncestorDiff(Find_Largest_Value_In_Each_Tree_Row_Oct_24.TreeNode root) {
        maxVal = minVal = root.val;
        inOrder(root,maxVal,minVal);

        return diff;
    }

    private void inOrder(Find_Largest_Value_In_Each_Tree_Row_Oct_24.TreeNode root, int maxVal, int minVal){
        if(root==null) return;
        diff = Math.max(diff,Math.max(Math.abs(minVal-root.val),Math.abs(maxVal-root.val)));
        minVal = Math.min(minVal,root.val);
        maxVal = Math.max(maxVal,root.val);
        inOrder(root.left,maxVal,minVal);
        inOrder(root.right,maxVal,minVal);
    }
}
