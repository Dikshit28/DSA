package ArshSheet.stack_queues;

import java.util.*;

class MyStack {
    private final Queue<Integer> inputbuf;

    public MyStack() {
        inputbuf = new LinkedList<Integer>();
    }

    public void push(int x) {
        inputbuf.add(x);
        for (int i = 1; i < inputbuf.size(); i++) {
            inputbuf.add(inputbuf.remove());
        }
    }

    public int pop() {
        return inputbuf.remove();
    }

    public int top() {
        return inputbuf.peek();
    }

    public boolean empty() {
        return inputbuf.isEmpty();
    }
}

public class stackUsingQueues86 {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
        System.out.println(param_2 + "," + param_4);
    }

}
