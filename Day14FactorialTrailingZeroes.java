import java.util.Scanner;

public class Day14FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Trailing Zeroes = " + trailingZeroes(n));

        sc.close();
    }
}