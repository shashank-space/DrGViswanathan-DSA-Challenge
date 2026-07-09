public class Day19ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            result.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int columnNumber = 701;

        System.out.println("Column Title: " + convertToTitle(columnNumber));
    }
}