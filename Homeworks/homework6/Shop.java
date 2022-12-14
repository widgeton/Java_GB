/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class Shop {
    public static void main(String[] args) {
        String[] colors = {"белый", "черный", "серый", "красный"};
        String[] valuesHardDisk = {"128", "256", "512", "1024"};
        String[] orms = {"4", "8", "16", "32"};
        String[] systems = {"Windows", "Linux"};

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("MYL1245678", "HP", "250 G8"));
        laptops.add(new Laptop("MYL2145678", "HP", "15s-eq1129ur"));
        laptops.add(new Laptop("MYL3545678", "HP", "255 G7"));
        laptops.add(new Laptop("MYL2178678", "HP", "245 G8"));
        laptops.add(new Laptop("DLL2178378", "Dell", "Inspiron 3511"));
        laptops.add(new Laptop("DLL2518678", "Dell", "Vostro 3515"));
        laptops.add(new Laptop("DLL2519878", "Dell", "Vostro 5502"));
        laptops.add(new Laptop("DLL2539878", "Dell", "Vostro 5402"));
        laptops.add(new Laptop("LEN3319878", "Lenovo", "IdeaPad 3 15IML05"));
        laptops.add(new Laptop("LEN3319578", "Lenovo", "V15 G2 ITL"));

        Random rnd = new Random();
        for (Laptop nb : laptops) {
            nb.setColor(colors[rnd.nextInt(colors.length)]);
            nb.setValueHardDisk(valuesHardDisk[rnd.nextInt(valuesHardDisk.length)]);
            nb.setOrm(orms[rnd.nextInt(orms.length)]);
            nb.setOs(systems[rnd.nextInt(systems.length)]);
        }

        Map<String, ArrayList<String>> choice1 = askUser(laptops);
        System.out.println("********************************************************\n");
        ArrayList<String> choice2 = lastQuestion(choice1);
        System.out.println("********************************************************\n");

        System.out.println("Ноутбуки по вашим критериям: ");
        for (String nb : choice2) {
            System.out.println(nb);
        }

    }

    public static Map<String, ArrayList<String>> askUser(Set<Laptop> laptops) {
        System.out.print("""
                Введите цифру, соответствующую необходимому критерию:
                1 - ОЗУ
                2 - Объем ЖД
                3 - Операционная система
                4 - цвет
                Ввод: """);
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        Map<String, ArrayList<String>> filtered = new HashMap<>();
        if (choice.equals("1")) {
            for (Laptop nb : laptops) {
                String key = nb.getOrm();
                if (filtered.containsKey(key) && !filtered.get(key).contains(nb.toString())) {
                    filtered.get(key).add(nb.toString());
                } else {
                    filtered.put(key, new ArrayList<>(List.of(nb.toString())));
                }
            }
        } else if (choice.equals("2")) {
            for (Laptop nb : laptops) {
                String key = nb.getValueHardDisk();
                if (filtered.containsKey(key) && !filtered.get(key).contains(nb.toString())) {
                    filtered.get(key).add(nb.toString());
                } else {
                    filtered.put(key, new ArrayList<>(List.of(nb.toString())));
                }
            }
        } else if (choice.equals("3")) {
            for (Laptop nb : laptops) {
                String key = nb.getOs();
                if (filtered.containsKey(key) && !filtered.get(key).contains(nb.toString())) {
                    filtered.get(key).add(nb.toString());
                } else {
                    filtered.put(key, new ArrayList<>(List.of(nb.toString())));
                }
            }
        } else if (choice.equals("4")) {
            for (Laptop nb : laptops) {
                String key = nb.getColor();
                if (filtered.containsKey(key) && !filtered.get(key).contains(nb.toString())) {
                    filtered.get(key).add(nb.toString());
                } else {
                    filtered.put(key, new ArrayList<>(List.of(nb.toString())));
                }
            }
        } else System.out.println("Неверный ввод");

        return filtered;
    }

    public static ArrayList<String> lastQuestion(Map<String, ArrayList<String>> choice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужное значение:");
        for (String key : choice.keySet()) {
            System.out.println(key);
        }
        System.out.print("Ввод: ");
        String lastChoice = sc.nextLine();
        if (choice.containsKey(lastChoice)) return choice.get(lastChoice);
        else {
            System.out.println("Такого значения нет");
            return new ArrayList<>();
        }
    }
}
