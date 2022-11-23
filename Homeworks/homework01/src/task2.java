//Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        int first = 1;
        int last = 1000;

        if (first == 1) {
            System.out.print(first + " ");
        }

        for (int i = first; i <= last; i++) {
            int count = 0;
            for (int j = first; j <= i / 2; j++) {
                if (i % j == 0) count++;
            }
            if (count == first) System.out.print(i + " ");
        }
    }
}
