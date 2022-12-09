import java.util.TreeMap;

public class app0 {
    public static void main(String[] args) {
        SortMap();
    }
    public static void SortMap(){
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Double, String> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for(int i=0; i<sMas.length;i++) {
            if (list.containsKey((double)sMas[i].length())) {
                list.put(sMas[i].length() + 0.000001 * i, sMas[i]);
            } else {
                list.put((double) sMas[i].length(), sMas[i]);
            }
        }

        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }

    }
}
