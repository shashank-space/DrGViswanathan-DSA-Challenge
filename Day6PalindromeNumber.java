public class Day6PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int num1 = 121;
        int num2 = -121;
        int num3 = 10;
        int num4 = 1221;

        System.out.println(num1 + " -> " + isPalindrome(num1));
        System.out.println(num2 + " -> " + isPalindrome(num2));
        System.out.println(num3 + " -> " + isPalindrome(num3));
        System.out.println(num4 + " -> " + isPalindrome(num4));
    }
}