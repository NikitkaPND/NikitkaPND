package src.com.senla;

import javafx.util.StringConverter;
import src.com.senla.util.Util;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util.printTextOnConsole("Введите текст: ");
        String line;
        line = scanner.nextLine();
        String[] massiveLine = line.split(" ");
        Util.printTextAndNumericOnConsole("Количество слов: ", Util.lentgh(massiveLine));
        Util.printTextOnConsole(Arrays.toString((Util.upFirstLetter(massiveLine))));
        Util.sort(massiveLine);
        Util.printTextOnConsole(Arrays.toString((massiveLine)));
    }
}
