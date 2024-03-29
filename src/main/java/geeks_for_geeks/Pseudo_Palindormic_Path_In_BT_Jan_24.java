package src.main.java.geeks_for_geeks;

import java.util.Stack;

public class Pseudo_Palindormic_Path_In_BT_Jan_24 {
    public int pseudoPalindromicPaths(TreeNode root) {
        int count = 0, path = 0;

        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 0));

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> p = stack.pop();
            TreeNode node = p.getKey();
            path = p.getValue();

            if (node != null) {
                path = path ^ (1 << node.val);

                if (node.left == null && node.right == null) {
                    if ((path & (path - 1)) == 0) {
                        ++count;
                    }
                } else {
                    stack.push(new Pair<>(node.right, path));
                    stack.push(new Pair<>(node.left, path));
                }
            }
        }

        return count;
    }
}
