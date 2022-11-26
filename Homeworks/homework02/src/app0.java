// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class app0 {
    public static void main(String[] args) {
        int[] arrInt = new int[15];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(1, 30);
        }
        System.out.println(Arrays.toString(arrInt));
        bubbleSort(arrInt);
        System.out.println(Arrays.toString(arrInt));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                logger(arr);
            }
        }
    }

    public static void logger(int[] arr) {
        try (FileWriter fw = new FileWriter("log.txt", true);) {
            fw.write(Arrays.toString(arr) + "\n");
            fw.flush();
        } catch (Exception ex) {
            System.out.printf("Ошибка записи: %s", ex);
        }
    }
}