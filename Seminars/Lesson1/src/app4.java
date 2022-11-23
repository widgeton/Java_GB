import java.util.Scanner;

public class app4 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{3, 7, 9, 4, 9, 1, 0};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == num) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
