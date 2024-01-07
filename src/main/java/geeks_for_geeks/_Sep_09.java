package geeks_for_geeks;

import java.util.ArrayList;

public class _Sep_09 {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> list = new ArrayList<>();
        levelOrder(root,list);
        return list.get(list.size()-K);

    }

    private void levelOrder(Node root, ArrayList<Integer>list){
        if(root == null) return;
        levelOrder(root.left,list);
        list.add(root.data);
        levelOrder(root.right,list);
    }
}
