public class Day16CountOddNumbers {

    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    public static void main(String[] args) {
        Day16CountOddNumbers sol = new Day16CountOddNumbers();

        int low = 3;
        int high = 7;

        System.out.println("Count of odd numbers: " + sol.countOdds(low, high));
    }
}