package ArshSheet.stack_queues;

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> inputbuf;
    private final Stack<Integer> output;

    /** Initialize your data structure here. */
    public MyQueue() {
        inputbuf = new Stack<Integer>();
        output = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputbuf.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (output.empty()) {
            while (!inputbuf.empty()) {
                output.push(inputbuf.pop());
            }
        }
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputbuf.empty() && output.empty();
    }
}

public class queueUsingStack84 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
        System.out.println(param_2 + "," + param_4);
    }
}