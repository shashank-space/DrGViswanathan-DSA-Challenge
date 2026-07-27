import java.util.LinkedList;
import java.util.Queue;

class Day35MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Day35MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Day35MyStack stack = new Day35MyStack();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.top());    // 2
        System.out.println(stack.pop());    // 2
        System.out.println(stack.empty());  // false
    }
}