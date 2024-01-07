package geeks_for_geeks;

public class _Aug_30 {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node deleteNode(Node head, int x){


        //If I need to delete the first element
        if(x == 1)
            return head.next;

        Node temp = head;//reference Node

        int count =1;
        while(count<x-1){
            temp = temp.next;
            count+=1;
        }
        temp.next = temp.next.next;

        return head;
    }
}
