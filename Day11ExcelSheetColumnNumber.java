public class Day11ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String columnTitle = "AB";

        System.out.println("Column Title: " + columnTitle);
        System.out.println("Column Number: " + titleToNumber(columnTitle));
    }
}