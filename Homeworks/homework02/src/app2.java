// Дана json строка (можно сохранить в файл и читать из файла).
// Написать метод(ы), который распарсит json и,
// используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        String path = "D:\\Java_GB\\Homeworks\\homework02\\src\\students.json";
        showStringResults(getArrayDictsFromJson(path));
    }

    public static ArrayList<Map> getArrayDictsFromJson(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            Scanner sc = new Scanner(fis);
            String line = sc.nextLine();
            return convertStringToArrayDicts(line);

        } catch (Exception ex) {
            System.out.printf("Ошибка чтения: %s", ex);
        }
        return new ArrayList<>();
    }

    public static ArrayList<Map> convertStringToArrayDicts(String line) {
        ArrayList<Map> arr = new ArrayList<>();
        Map<String, String> dict = new HashMap<>();

        int flagBracket = 0;
        int flagQout = 0;

        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {

            if (line.charAt(i) == '{' || line.charAt(i) == '}') flagBracket++;

            if (line.charAt(i) == '"') flagQout++;

            if (flagBracket == 1) {
                if (flagQout == 1 && line.charAt(i) != '"') key.append(line.charAt(i));
                else if (flagQout == 3 && line.charAt(i) != '"') value.append(line.charAt(i));
                else if (flagQout == 4) {
                    dict.put(key.toString(), value.toString());

                    key = new StringBuilder();
                    value = new StringBuilder();
                    flagQout = 0;
                }
            }

            if (flagBracket == 2) {
                arr.add(dict);
                dict = new HashMap<>();
                flagBracket = 0;
            }

        }

        return arr;
    }

    public static void showStringResults(ArrayList<Map> arr) {
        for (Map d : arr) {
            String name = d.get("фамилия").toString();
            String mark = d.get("оценка").toString();
            String subject = d.get("предмет").toString();

            String str = String.format("Студент %s получил(а) %s по предмету %s", name, mark, subject);
            System.out.println(str);
        }
    }
}
