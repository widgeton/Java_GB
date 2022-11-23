// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
public class task4 {
    public static void main(String[] args) {
        String expression = "2? + ?5 = 69";
        System.out.println("Выражение: " + expression);
        expression = expression.replace("+ ", "").replace("= ", "");

        String[] numbers = expression.replace("?", "0").split(" ");
        String[] express = expression.split(" ");

        int q = Integer.parseInt(numbers[0]);
        int w = Integer.parseInt(numbers[1]);
        int e = Integer.parseInt(numbers[2]);

        String diff = Integer.toString(e - (q + w));

        for (int i = 0; i < numbers.length; i++) {
            int index = express[i].indexOf("?");
            if(index == -1) continue;
            String num = Character.toString(diff.charAt(index));
            express[i] = express[i].replaceFirst("\\?", num);
        }

        System.out.printf("Возможное решение: %s + %s = %s", express[0], express[1], express[2]);

    }
}
