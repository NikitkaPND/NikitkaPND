package src.com.senla.util;

public class Util {

    public static void printTextAndNumericOnConsole(String text, int Numeric) {
        System.out.println(text + " " + Numeric);
    }

    public static void printNumericOnConsole(int Numeric) {
        System.out.println(Numeric);
    }

    public static void printTextOnConsole(String text) {
        System.out.println(text);
    }

    public static boolean isPalindrome(int example) {
        int n = example;
        int rev = 0;
        while (example > 0) {
            var dig = example % 10;
            rev = rev * 10 + dig;
            example /= 10;
        }
        return n == rev;
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
