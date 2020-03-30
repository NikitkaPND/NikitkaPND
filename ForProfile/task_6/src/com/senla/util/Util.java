package src.com.senla.util;

public class Util {
    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void printTextAndNumericOnConsole(String text, int Numeric) {
        System.out.println(text + " " + Numeric);
    }

    public static void printNumericOnConsole(int Numeric) {
        System.out.println(Numeric);
    }

    public static void printTextOnConsole(String text) {
        System.out.println(text);
    }
}
