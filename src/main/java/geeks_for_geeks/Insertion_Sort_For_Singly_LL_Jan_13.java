package src.main.java.geeks_for_geeks;

public class Insertion_Sort_For_Singly_LL_Jan_13 {
    class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static Node insertionSort(Node head_ref)
    {
        Node dummy = head_ref;
        for(Node i = head_ref;i!=null;i=i.next){
            for(Node j=i.next;j!=null;j=j.next){
                if(i.data>j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        return dummy;
    }
}
