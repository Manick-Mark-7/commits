package src.main.java.leetcode.binarySearch.daily_challenge;

import java.util.Stack;

public class Implement_Queue_Using_Stack_Jan_29 {
    private Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        Stack<Integer> saver = new Stack<>();
        while(!stack.isEmpty())saver.push(stack.pop());
        int val = saver.pop();
        while(!saver.isEmpty())stack.push(saver.pop());
        return val;
    }

    public int peek() {
        Stack<Integer> saver = new Stack<>();
        while(!stack.isEmpty())saver.push(stack.pop());
        int val = saver.peek();
        while(!saver.isEmpty())stack.push(saver.pop());
        return val;

    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
