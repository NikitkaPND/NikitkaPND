package src.com.senla;

import src.com.senla.util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeric;
        do {
            Util.printOnConsole("Введите число: ");
            numeric = scanner.nextLine();
        } while (!Util.isNumeric(numeric));
        if (Util.isEven(Integer.parseInt(Numeric)))
            Util.printOnConsole("Число четное!");
        else {
            Util.printOnConsole("Число нечетное!");
        }
        if (Util.isPrime(Integer.parseInt(numeric)))
            Util.printOnConsole("Число простое!");
        else {
            Util.printOnConsole("Число составное!");
        }
    }
}
