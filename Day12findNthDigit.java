import java.util.Scanner;
public class Day12findNthDigit{
    public static int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / digitLength;

        String number = Long.toString(start);

        return number.charAt((int) ((n - 1) % digitLength)) - '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Nth Digit: " + findNthDigit(n));

        sc.close();
    }
}