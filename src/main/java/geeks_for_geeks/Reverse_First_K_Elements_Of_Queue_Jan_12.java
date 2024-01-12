package src.main.java.geeks_for_geeks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K_Elements_Of_Queue_Jan_12 {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) st.push(q.remove());
        for (int i = 0; i<k; i++) ((LinkedList<Integer>) q).addFirst(st.get(i));
        return q;
    }
}
