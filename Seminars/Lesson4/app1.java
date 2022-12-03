import java.util.LinkedList;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = sc.nextLine();

        LinkedList<String> linkl = new LinkedList<>();
        String[] arr = line.split("~");

        int ind = Integer.parseInt(arr[1]);
        for (int i = 0; i < ind * 2; i++) {
            linkl.add("Строка " + i);
        }

        if (arr[0].equals("print")) {
            String a = linkl.remove(ind);
            System.out.println(a);
        } else {
            linkl.add(ind, arr[0]);
        }

        System.out.println(linkl);
    }
}
