public class Day28FindGreatestCommonDivisorOfArray {
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum elements
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Return GCD of min and max
        return gcd(min, max);
    }

    // Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};

        System.out.println("Input Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\nGCD of Smallest and Largest Element: " + findGCD(nums));
    }
}