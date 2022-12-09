import java.util.ArrayList;
import java.util.TreeMap;

public class app1 {
    public static void main(String[] args) {
        SortMap();
    }
    public static void SortMap() {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Integer, ArrayList<String>> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for (int i = 0; i < sMas.length; i++) {
            if(list.containsKey(sMas[i].length())){
                list.get(sMas[i].length()).add(sMas[i]);
            } else {
                ArrayList<String> lst = new ArrayList<>();
                lst.add(sMas[i]);
                list.put(sMas[i].length(), lst);
            }
        }

        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
