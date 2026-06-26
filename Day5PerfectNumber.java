import java.util.Scanner;

public class Day5PerfectNumber {

    public static boolean checkPerfectNumber(int num) {

        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (checkPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is Not a Perfect Number.");
        }

        sc.close();
    }
}
