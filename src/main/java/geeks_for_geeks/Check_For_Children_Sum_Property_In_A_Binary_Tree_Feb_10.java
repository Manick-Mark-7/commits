package src.main.java.geeks_for_geeks;

public class Check_For_Children_Sum_Property_In_A_Binary_Tree_Feb_10 {
    public static int isSumProperty(Node root)
    {
        if(root==null) return 1;
        if(root.left==null & root.right==null) return 1;
        int sum=0;
        if(root.left!=null)sum+=root.left.data;
        if(root.right!=null)sum+=root.right.data;
        if(root.data==sum) return (isSumProperty(root.left)&isSumProperty(root.right));
        return 0;
    }
}
