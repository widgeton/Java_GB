//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class app1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int length = 16;
        ArrayList<Integer> intArray = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            intArray.add(rnd.nextInt(1, 100));
        }
        System.out.println(intArray);

        for (int i = 0; i < intArray.size(); i++) {
            if (intArray.get(i) % 2 == 0) {
                intArray.remove(i);
                i--;
            }
        }
        System.out.println(intArray);
    }
}
