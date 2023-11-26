package geeks_for_geeks;

public class _Aug_28 {
    class Node {
        int data;
        Node next;
        Node(int d){
            this.data =d;
        }
    }
    Node removeDuplicates(Node head)
    {
        Node temp = head;
        while(temp.next!=null){
            if(temp.data==temp.next.data) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }
}
