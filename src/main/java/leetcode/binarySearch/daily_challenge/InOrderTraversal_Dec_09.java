package leetcode.binarySearch.daily_challenge;


import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){}
    public TreeNode(int val){this.val = val;}

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//Inorder traversal of the binary tree
public class InOrderTraversal_Dec_09 {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        inOrder(root,ans);
        return ans;
    }

    private void inOrder(TreeNode root, List<Integer>ans){
        if(root == null) return;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);

    }
}
