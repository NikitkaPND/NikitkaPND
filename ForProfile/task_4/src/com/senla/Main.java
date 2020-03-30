package src.com.senla;

import src.com.senla.util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util.printTextOnConsole("Введите предложение: ");
        String line = scanner.nextLine().toLowerCase();
        Util.printTextOnConsole("Введите искомое слово: ");
        String searchWord = scanner.nextLine().toLowerCase();
        Util.printTextAndNumericOnConsole("Количество слов: ", Util.counting(line, searchWord));
    }
}
