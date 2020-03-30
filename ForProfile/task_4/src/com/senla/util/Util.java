package src.com.senla.util;

public class Util {
    public static void printTextAndNumericOnConsole(String text, int Numeric) {
        System.out.println(text + " " + Numeric);
    }

    public static void printTextOnConsole(String text) {
        System.out.println(text);
    }

    public static int counting(String line, String searchWord) {
        return (line + "\0").split(searchWord).length - 1;
    }


}
