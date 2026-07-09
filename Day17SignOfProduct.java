public class Day17SignOfProduct {

    public static int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};

        System.out.println("Sign of Product: " + arraySign(nums));
    }
}