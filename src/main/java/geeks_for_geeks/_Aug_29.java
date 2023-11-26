package geeks_for_geeks;

public class _Aug_29 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node compute(Node head)
    { Node curr;
        Node temp;

        if(head==null || head.next==null){

            return head;

        }


        curr=head;
        temp=compute(head.next);

        if(curr.data<temp.data){

            curr=temp;
            head=curr;

        }else{

            curr.next=temp;
            head=curr;

        }
        return head;
    }
}
