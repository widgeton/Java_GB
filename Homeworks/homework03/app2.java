//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class app2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int length = 10;
        ArrayList<Integer> intArray = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            intArray.add(rnd.nextInt(1, 100));
        }
        System.out.println(intArray);

        int minimum = Collections.min(intArray);
        System.out.println("Минимальное: " + minimum);

        int maximum = Collections.max(intArray);
        System.out.println("Максимальное: " + maximum);

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += intArray.get(i);
        }
        double average = (double) sum / length;

        int num = intArray.get(0);
        double diffLast = num - average;
        for (int i = 1; i < length; i++) {
            double diffNext = Math.abs(intArray.get(i) - average);
            if (diffNext < diffLast){
                num = intArray.get(i);
                diffLast = diffNext;
            }
        }

        System.out.println("Среднее: " + num);

    }
}
