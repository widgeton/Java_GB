import java.util.Objects;
import java.util.Scanner;

//Реализовать простой калькулятор
public class task3 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Введите второе число: ");
        int b = new Scanner(System.in).nextInt();

        System.out.print("Введите знак: ");
        String sign = new Scanner(System.in).nextLine();

        if (Objects.equals(sign, "+")) System.out.printf("%d + %d = %d", a, b, a+b);
        else if (Objects.equals(sign, "-")) System.out.printf("%d - %d = %d", a, b, a-b);
        else if (Objects.equals(sign, "*")) System.out.printf("%d * %d = %d", a, b, a*b);
        else if (Objects.equals(sign, "/")) System.out.printf("%d / %d = %f", a, b, (double)a/b);
        else System.out.println("Неверный ввод");
    }
}
