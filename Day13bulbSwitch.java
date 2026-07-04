import java.util.Scanner;

class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}

public class Day13bulbSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution solution = new Solution();
        System.out.println(solution.bulbSwitch(n));

        sc.close();
    }
}