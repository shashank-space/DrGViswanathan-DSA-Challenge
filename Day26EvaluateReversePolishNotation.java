import java.util.Stack;

public class Day26EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            switch (token) {

                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int b1 = stack.pop();
                    int a1 = stack.pop();
                    stack.push(a1 - b1);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int b2 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 / b2);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println("Result: " + evalRPN(tokens));
    }
}