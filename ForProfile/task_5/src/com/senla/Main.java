package src.com.senla;

import src.com.senla.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util.printTextOnConsole("Введите количество чисел, которое хотите ввести: ");
        String col;
        do {
            Util.printTextOnConsole("Введите число (от 0 до 100): ");
            col = scanner.nextLine();
        } while (!Util.isNumeric(col) || Integer.parseInt(col) > 100 || Integer.parseInt(col) < 0);
        int[] example = new int[Integer.parseInt(col)];
        String buf;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(col); i++) {
            Util.printTextOnConsole("Введите " + (i + 1) + " число: ");
            buf = scanner.nextLine();
            if (Util.isNumeric(buf)) {
                example[i] = Integer.parseInt(buf);
                if (Util.isPalindrome(example[i])) {
                    res.add(example[i]);
                }
            } else {
                i = i - 1;
                continue;
            }
        }
        Util.printTextOnConsole("Список палиндромов: ");
        res.stream().forEach(num -> Util.printNumericOnConsole(num));
    }
}
