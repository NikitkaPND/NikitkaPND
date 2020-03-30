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

    public static boolean isEven(int Numeric) {
        return Numeric % 2 == 0;
    }

    public static boolean isPrime(int Numeric) {
        if (isEven(Numeric) && Numeric > 2)
            return false;
        int buf = 3;
        while (buf * buf <= Numeric && Numeric % buf != 0 && Numeric != 0) {
            buf += 2;
        }
        return !(buf * buf < Numeric);
    }

    public static void printOnConsole(String text){
        System.out.println(text);
    }

}

