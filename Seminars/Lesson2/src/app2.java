//Напишите метод, который вернет содержимое текущей папки в виде массива строк. Напишите метод,
//который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
//оно должно записаться в лог-файл.


import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class app2 {
    public static void main(String[] args) {
        String path = "D:\\Java_GB\\Seminars\\Lesson2";
        print(getFolderContent(path));
        writeFolderContent(getFolderContent(path));

    }

    public static ArrayList<String> getFolderContent(String path) {
        ArrayList<String> array = new ArrayList<>();
        try {
            File f1 = new File(path);
            for (File f : f1.listFiles()) {
                array.add(f.getName());
            }
            return array;
        } catch (Exception e) {
            logger("Ошибка открытия файла");
            System.out.println("Ошибка открытия файла");
            array.add("ОШИБКА");
            return array;
        }
    }

    public static void print(ArrayList<String> array) {
        for (String i : array
        ) {
            System.out.println(i);
        }
    }

    public static void writeFolderContent(ArrayList<String> array) {
        try {
            FileWriter fw = new FileWriter("content.txt", true);
            for (String f : array) {
                fw.write(f);
                fw.append("\n");
            }
            fw.flush();
        } catch (Exception e) {
            logger("Ошибка записи файла");
            System.out.println("Ошибка записи файла");
        }
    }

    public static void logger(String text) {
        try {
            FileWriter log = new FileWriter("log.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");
            log.flush();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
