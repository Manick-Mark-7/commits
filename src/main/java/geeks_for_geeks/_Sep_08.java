package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Collections;

public class _Sep_08 {

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }

        Node binaryTreeToBST(Node root) {
            ArrayList<Integer> al = new ArrayList<>();
            inOrder(root, al);
            Collections.sort(al);
            return buildBST(al, 0, al.size() - 1);

        }

        void inOrder(Node root, ArrayList<Integer> al) {
            if (root == null) return;
            inOrder(root.left, al);
            al.add(root.data);
            inOrder(root.right, al);
        }

        private Node buildBST(ArrayList<Integer> al, int low, int high) {
            if (low > high) return null;
            int mid = low + (high - low) / 2;
            Node root = new Node(al.get(mid));
            root.left = buildBST(al, low, mid - 1);
            root.right = buildBST(al, mid + 1, high);
            return root;
        }

    }
}
