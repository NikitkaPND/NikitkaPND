package src.com.senla.util;

import java.util.Arrays;

public class Util {
    public static void printTextOnConsole(String text) {
        System.out.println(text);
    }

    public static void printTextAndNumericOnConsole(String text, int Numeric) {
        System.out.println(text + " " + Numeric);
    }

    public static String[] upFirstLetter(String[] line) {
        for (int i = 0; i < line.length; i++) {
            line[i] = line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
        }
        return line;
    }

    public static void sort(String[] line) {
        Arrays.sort(line);
    }

    public static int lentgh(String[] line){
        return line.length;
    }
}
