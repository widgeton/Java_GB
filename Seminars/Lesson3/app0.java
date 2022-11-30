// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class app0 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);
        Collections.sort(intArray);
        System.out.println(intArray);
    }
}
