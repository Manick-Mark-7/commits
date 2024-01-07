package geeks_for_geeks;

public class _Sep_10 {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }  Node insert(Node root, int key) {
        // your code here
        if(root==null)  root = new Node(key);
        else{
            if(root.data==key) return root;
            else if(root.data>key) root.left = insert(root.left, key);
            else root.right = insert(root.right, key);
        }
        return root;
    }


}
