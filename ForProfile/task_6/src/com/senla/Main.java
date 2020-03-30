package src.com.senla;

import src.com.senla.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util.printTextOnConsole("Введите вместимость рюкзака: ");
        String m;
        do {
            Util.printTextOnConsole("Введите число: ");
            m = scanner.nextLine();
        } while (!Util.isNumeric(m) || parseInt(m) < 0);
        Util.printTextOnConsole("Введите количество грузов: ");
        String col, buf;
        do {
            Util.printTextOnConsole("Введите число: ");
            col = scanner.nextLine();
        } while (!Util.isNumeric(col) || parseInt(col) < 0);
        int[] masCol = new int[parseInt(col)];
        int[] price = new int[parseInt(col)];
        for (int i = 0; i < parseInt(col); i++) {
            Util.printTextOnConsole("Введите массу " + (i + 1) + " груза: ");
            do {
                Util.printTextOnConsole("Введите число: ");
                buf = scanner.nextLine();
                if (Util.isNumeric(buf)) {
                    masCol[i] = parseInt(buf);
                }
            } while (!Util.isNumeric(col) || parseInt(col) < 0);
            Util.printTextOnConsole("Введите цену " + (i + 1) + " груза: ");
            do {
                Util.printTextOnConsole("Введите число: ");
                buf = scanner.nextLine();
                if (Util.isNumeric(buf)) {
                    price[i] = parseInt(buf);
                }
            } while (!Util.isNumeric(col) || parseInt(col) < 0);
        }

        int[][] otvet = new int[parseInt(col) + 1][parseInt(m) + 1];
        for (int i = 0; i < parseInt(col) + 1; i++)
            for (int j = 0; j < parseInt(m); j++) {
                otvet[i][j] = 0;
            }

        for (int k = 1; k <= parseInt(col); k++)
            for (int s = 1; s <= parseInt(m); s++) {
                if (s >= masCol[k - 1]) {
                    var otl1 = otvet[k - 1][s];
                    var otl2 = otvet[k - 1][s - masCol[k - 1]] + price[k - 1];
                    otvet[k][s] = Math.max(otl1, otl2);
                } else
                    otvet[k][s] = otvet[k - 1][s];
            }

        int m1 = parseInt(m);
        List<Integer> res = new ArrayList<>();
        for (int i = parseInt(col); i > 0; i--) {
            if (otvet[i][parseInt(m)] == 0) {
                break;
            }
            if (otvet[i - 1][m1] == otvet[i][m1]) {
                continue;
            } else {
                m1 -= masCol[i - 1];
                res.add(i);
            }
        }

        AtomicInteger ee = new AtomicInteger();
        res.stream().forEach(e->Util.printTextOnConsole(ee.incrementAndGet() + ": груз № " + e + " массой " + masCol[e - 1] + " "));

        if (res.size() == 0) {
            Util.printTextOnConsole("Ни один груз не влезает!");
        }

    }
}