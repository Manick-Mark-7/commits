package geeks_for_geeks;

import java.util.LinkedList;
import java.util.Queue;

public class _Sep_01 {

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void printCorner(Node node)
    {


        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=0;i<n;i++){


                Node temp = queue.poll();
                if((i==0) || (i==n-1)){
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }


                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
    }
}
