public class Day29ValidParenthesisString{

    public static boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            } else if (ch == ')') {
                minOpen--;
                maxOpen--;
            } else { // '*'
                minOpen--;
                maxOpen++;
            }

            if (maxOpen < 0) {
                return false;
            }

            minOpen = Math.max(minOpen, 0);
        }

        return minOpen == 0;
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "(*)";
        String s3 = "(*))";

        System.out.println(checkValidString(s1)); // true
        System.out.println(checkValidString(s2)); // true
        System.out.println(checkValidString(s3)); // true
    }
}