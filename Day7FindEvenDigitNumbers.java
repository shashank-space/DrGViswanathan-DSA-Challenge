public class Day7FindEvenDigitNumbers {

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = countDigits(num);

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }

    public static void main(String[] args) {

        int[] nums1 = {12, 345, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};

        System.out.println("Output: " + findNumbers(nums1));
        System.out.println("Output: " + findNumbers(nums2));
    }
}