//К калькулятору из предыдущего дз добавить логирование.

import java.io.FileWriter;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Введите второе число: ");
        int b = new Scanner(System.in).nextInt();

        System.out.print("Введите знак: ");
        String sign = new Scanner(System.in).nextLine();

        if (sign.equals("+")) {
            String line = String.format("%d + %d = %d", a, b, a + b);
            System.out.printf(line);
            logger(line);
        } else if (sign.equals("-")) {
            String line = String.format("%d - %d = %d", a, b, a - b);
            System.out.printf(line);
            logger(line);
        } else if (sign.equals("*")) {
            String line = String.format("%d * %d = %d", a, b, a * b);
            System.out.printf(line);
            logger(line);
        } else if (sign.equals("/")) {
            String line = String.format("%d / %d = %f", a, b, (double) a / b);
            System.out.printf(line);
            logger(line);
        } else System.out.println("Неверный ввод");
    }

    public static void logger(String str) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(str + '\n');
            fw.flush();
        } catch (Exception ex) {
            System.out.printf("Ошибка записи: %s", ex);
        }
    }
}
