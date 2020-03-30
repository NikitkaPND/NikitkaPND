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

    public static int gcd(int number1, int number2) {
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }
        return Math.abs(Math.max(number1, number2));
    }

    public static int lcm(int number1, int number2) {
        return Math.abs(number1 * number2) / gcd(number1, number2);
    }

    public static void printTextOnConsole(String text) {
        System.out.println(text);
    }

    public static void printTextAndNumericOnConsole(String text, int Numeric) {
        System.out.println(text + " " + Numeric);
    }
}
