// Дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по популярности.


import java.util.*;

public class app1 {
    public static void main(String[] args) {
        String[] employees = {"Иванов", "Петров", "Смирнов", "Грачев", "Иванов", "Петров", "Иванов",
                "Петров", "Иванов", "Петров", "Петров", "Смирнов", "Смирнов"};


        for (String name:employees) {
            System.out.print(name + " ");
        }
        System.out.println();


        Map<String, Integer> duplicateNames = new HashMap<>();

        for (String employee : employees) {
            if (!duplicateNames.containsKey(employee)) {
                duplicateNames.put(employee, 1);
            } else {
                int value = duplicateNames.get(employee);
                duplicateNames.put(employee, value + 1);
            }
        }


        ArrayList<Integer> arr = new ArrayList<>(duplicateNames.values());
        Collections.sort(arr);
        Collections.reverse(arr);

        for (Integer integer : arr) {
            for (String name : duplicateNames.keySet()) {
                if (Objects.equals(duplicateNames.get(name), integer)) {
                    System.out.println(integer + " " + name);
                    duplicateNames.remove(name);
                    break;
                }
            }
        }

    }
}
