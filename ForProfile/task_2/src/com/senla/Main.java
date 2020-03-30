package src.com.senla;

import src.com.senla.util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Numeric1, Numeric2;
        do {
            Util.printTextOnConsole("Введите первое число: ");
            Numeric1 = scanner.nextLine();
        } while (!Util.isNumeric(Numeric1));
        do {
            Util.printTextOnConsole("Введите второе число: ");
            Numeric2 = scanner.nextLine();
        } while (!Util.isNumeric(Numeric2));
        Util.printTextAndNumericOnConsole("НОД", Util.gcd(Integer.parseInt(Numeric1), Integer.parseInt(Numeric2)));
        Util.printTextAndNumericOnConsole("НОК", Util.lcm(Integer.parseInt(Numeric1), Integer.parseInt(Numeric2)));
    }
}
