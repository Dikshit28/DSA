package ArshSheet.stack_queues;

import java.util.Stack;

public class StockSpanner92 {
    Stack<int[]> st;

    public StockSpanner92() {
        st = new Stack<>();
    }

    public int next(int price) {
        int res = 1;
        while (!st.isEmpty() && st.peek()[0] <= price)
            res += st.pop()[1];
        st.push(new int[] { price, res });
        return res;
    }

    public static void main(String[] args) {

    }
}
