import java.util.Stack;

public class Day21MinStack {

    static class MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin()); // -3
        obj.pop();
        System.out.println(obj.top());    // 0
        System.out.println(obj.getMin()); // -2
    }
}