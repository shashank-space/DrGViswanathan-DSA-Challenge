public class Day30MinimumRemoveToMakeValidParentheses {

    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);

        int openCount = 0;

        // Remove invalid closing parentheses
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                if (openCount == 0) {
                    sb.setCharAt(i, '#');
                } else {
                    openCount--;
                }
            }
        }

        // Remove extra opening parentheses
        for (int i = sb.length() - 1; i >= 0 && openCount > 0; i--) {
            if (sb.charAt(i) == '(') {
                sb.setCharAt(i, '#');
                openCount--;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '#') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "lee(t(c)o)de)";
        String s2 = "a)b(c)d";
        String s3 = "))((";

        System.out.println(minRemoveToMakeValid(s1));
        System.out.println(minRemoveToMakeValid(s2));
        System.out.println(minRemoveToMakeValid(s3));
    }
}