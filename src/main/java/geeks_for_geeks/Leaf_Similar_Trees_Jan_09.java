package src.main.java.geeks_for_geeks;

import leetcode.binarySearch.daily_challenge.Find_Largest_Value_In_Each_Tree_Row_Oct_24;

import java.util.ArrayList;
import java.util.List;

class TreeNode1{
    TreeNode1(){

    }

    int val;

    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val){
        this.val  = val;
    }

    TreeNode1(int val,TreeNode1 left,TreeNode1 right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Leaf_Similar_Trees_Jan_09 {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode1 root1, TreeNode1 root2) {
        inOrder(root1,list1);
        inOrder(root2,list2);
        return list1.equals(list2);
    }

    private void inOrder(TreeNode1 root,List<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null) list.add(root.val);
        inOrder(root.left,list);

        inOrder(root.right,list);

    }

}
