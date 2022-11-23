//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fac = calculateFactorial(num);
        int triang = calculateTriangularNumber(num);

        System.out.println("Факториал введенного числа: " + fac);
        System.out.println("Треугольное число введенного значения: " + triang);
    }

    public static int calculateFactorial(int num) {
        if (num == 1) return num;
        return num * calculateFactorial(num - 1);
    }

    public static int calculateTriangularNumber(int num) {
        if (num == 1) return num;
        return num + calculateTriangularNumber(num - 1);
    }


}