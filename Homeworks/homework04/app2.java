//Написать программу, определяющую правильность расстановки скобок в выражении.
//        a+(d*3) - истина
//        \[a+(1*3) - ложь
//        \[6+(3*3)] - истина
//        {a}\[+\]{(d*3)} - истина
//        <{a}+{(d*3)}> - истина
//        {a+]}{(d*3)} - ложь


public class app2 {
    public static void main(String[] args) {
        String[] array = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]",
                "{a}\\[+\\]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        String chk = "";

        for (String str : array) {
            if (checkExpression(str)) chk = "истина";
            else chk = "ложь";

            System.out.print(str + " - " + chk + "\n");
        }
    }

    public static boolean checkExpression(String line) {
        boolean flagBrecket1 = true;
        boolean flagBrecket2 = true;
        boolean flagBrecket3 = true;
        boolean flagBrecket4 = true;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(' || line.charAt(i) == ')') {
                flagBrecket1 = !flagBrecket1;
            } else if (line.charAt(i) == '{' || line.charAt(i) == '}')
                flagBrecket2 = !flagBrecket2;
            else if (line.charAt(i) == '[' || line.charAt(i) == ']')
                flagBrecket3 = !flagBrecket3;
            else if (line.charAt(i) == '<' || line.charAt(i) == '>')
                flagBrecket4 = !flagBrecket4;
        }

        return flagBrecket1 && flagBrecket2 && flagBrecket3 && flagBrecket4;
    }
}
