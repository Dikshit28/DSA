package ArshSheet.stack_queues;

public class twoStacks90 {
    int size, top1, top2;
    int[] arr;

    twoStacks90(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public int peek1() {
        if (top1 >= 0) {
            return arr[top1];
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return -1;
    }

    public int peek2() {
        if (top2 < size) {
            return arr[top2];
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return -1;
    }

    public int pop1() {
        int x = peek1();
        top1--;
        return x;
    }

    public int pop2() {
        int x = peek2();
        top2++;
        return x;
    }

    public boolean isEmpty1() {
        return top1 == 0;
    }

    public boolean isEmpty2() {
        return top2 == size - 1;
    }

    public static void main(String[] args) {
        twoStacks90 ts = new twoStacks90(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" + " stack2 is " + ts.pop2());
    }
}
