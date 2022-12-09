import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.*;

// Реализовать структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
public class app0 {
    public static void main(String[] args) {
        Map<String, Integer> phones = new HashMap<>();
        Map<Integer, String> names = new HashMap<>();
        Map<String, ArrayList<Integer>> hashesOfEqualsNames = new HashMap<>();
        Map<Integer, ArrayList<String>> phoneNumbersByHashName = new HashMap<>();

        String path = "bd.csv";

        readFile(path, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);


        while (true) {
            System.out.println("Введите 1 чтобы НАЙТИ ИМЯ по номеру телефона");
            System.out.println("Введите 2 чтобы НАЙТИ НОМЕР телефона по имени");
            System.out.println("Введите 3 чтобы ДОБАВИТЬ новое ИМЯ с телефоном");
            System.out.println("Введите 4 чтобы ДОБАВИТЬ новый НОМЕР к существующему имени");
            System.out.println("Введите 5 чтобы УДАЛИТЬ ИМЯ из базы данных");
            System.out.println("Введите 6 чтобы УДАЛИТЬ НОМЕР телефона из базы данных");
            System.out.println("Введите 7 чтобы ПОКАЗАТЬ ВСЕ ИМЕНА и их телефонные номера");
            System.out.println("Введите 8 чтобы ВЫЙТИ из меню");
            System.out.print("\nВвод: ");

            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

            System.out.println("********************************************************\n");

            if (choice.equals("1"))
                findAPersonByPhoneNumber(phones, names);
            else if (choice.equals("2"))
                findPhoneNumberByName(hashesOfEqualsNames, phoneNumbersByHashName);
            else if (choice.equals("3"))
                addNewNameWithPhoneNumber(path, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
            else if (choice.equals("4"))
                addOneMorePhoneNumber(path, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
            else if (choice.equals("5"))
                deleteName(path, names, phones, hashesOfEqualsNames, phoneNumbersByHashName);
            else if (choice.equals("6"))
                deletePhoneNumber(path, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
            else if (choice.equals(("7")))
                showAllNamesWithPhoneNumbers(names, phoneNumbersByHashName);
        else if (choice.equals("8")) break;
            else {
                System.out.println("Неверный ввод. Попробуйте еще раз.");
                System.out.println("********************************************************\n");
            }

        }

    }
    public static void readFile (String filePath, Map<String, Integer> phones, Map<Integer, String> names,
                                 Map<String, ArrayList<Integer>> hashesOfEqualsNames,
                                 Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        phones.clear();
        names.clear();
        hashesOfEqualsNames.clear();
        phoneNumbersByHashName.clear();
        try {
            FileInputStream file = new FileInputStream(filePath);
            Scanner sc = new Scanner(file);

            for (int i = 0; sc.hasNextLine(); i++) {
                String[] temp = sc.nextLine().split(";");
                names.put(i, temp[0]);
                phoneNumbersByHashName.put(i, new ArrayList<>());
                for (int j = 1; j < temp.length; j++) {
                    phones.put(temp[j], i);
                    phoneNumbersByHashName.get(i).add(temp[j]);
                }

                if (hashesOfEqualsNames.containsKey(temp[0])){
                    hashesOfEqualsNames.get(temp[0]).add(i);
                } else {
                    hashesOfEqualsNames.put(temp[0], new ArrayList<>(List.of(i)));
                }
            }
        } catch (Exception ex){
            System.out.println("Ошибка чтения");
        }
    }

    public static void findAPersonByPhoneNumber(Map<String, Integer> phones, Map<Integer, String> names) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер (например 89995005522): ");
        String phoneNumber = sc.nextLine();
        if (phones.containsKey(phoneNumber)){
            System.out.println(names.get(phones.get(phoneNumber)));
            System.out.println("********************************************************\n");
        } else {
            System.out.println("Такого номера нет в базе данных");
            System.out.println("********************************************************\n");
        }
    }

    public static void findPhoneNumberByName(Map<String, ArrayList<Integer>> hashesOfEqualsNames,
                                             Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя (например Иванов Иван Иванович): ");
        String name = sc.nextLine();
        if (!hashesOfEqualsNames.containsKey(name)){
            System.out.println("Такого имени нет в базе данных");
            System.out.println("********************************************************\n");
        } else {
            for (int i = 0; i < hashesOfEqualsNames.get(name).size(); i++) {
                System.out.println(name);
                int hashName = hashesOfEqualsNames.get(name).get(i);
                for (int j = 0; j < phoneNumbersByHashName.get(hashName).size(); j++) {
                    String phoneNumber = phoneNumbersByHashName.get(hashName).get(j);
                    System.out.println("\t"+ phoneNumber);
                }
            }
            System.out.println("********************************************************\n");
        }
    }
    public static void addNewNameWithPhoneNumber(String filePath, Map<String, Integer> phones, Map<Integer, String> names,
                                                 Map<String, ArrayList<Integer>> hashesOfEqualsNames,
                                                 Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя (например Иванов Иван Иванович): ");
        String name = sc.nextLine();
        System.out.print("Введите номер (например 89995005522): ");
        String phoneNumber = sc.nextLine();

        if (phones.containsKey(phoneNumber)){
            System.out.println("Этот номер телефона уже есть в базе данных");
            System.out.println("********************************************************\n");
        } else {
            try {
                FileWriter fw = new FileWriter(filePath, true);
                String line = String.format("%s;%s\n", name, phoneNumber);
                fw.write(line);
                fw.flush();
                System.out.println("Новое имя с номером успешно добавлены!");
                System.out.println("********************************************************\n");
            } catch (Exception ex) {
                System.out.println("Ошибка записи");
            }
            readFile(filePath, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
        }
    }
    public static void addOneMorePhoneNumber(String filePath, Map<String, Integer> phones,  Map<Integer, String> names,
                                             Map<String, ArrayList<Integer>> hashesOfEqualsNames,
                                             Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите имя к которому нужно добавить еще один номер: ");
        String name = sc1.nextLine();
        if(!hashesOfEqualsNames.containsKey(name)){
            System.out.println("Этого имени нет в базе данных");
            System.out.println("********************************************************\n");
            return;
        }

        System.out.print("Введите добавляемый номер телефона: ");
        String newPhone = sc1.nextLine();
        if(phones.containsKey(newPhone)){
            System.out.println("Такой телефон уже есть в базе данных");
            System.out.println("********************************************************\n");
            return;
        }

        try{
            FileWriter fw = new FileWriter(filePath);

            if(hashesOfEqualsNames.get(name).size() == 1) {
                for (int i = 0; i < names.size(); i++) {
                    String line = names.get(i);
                    for (int j = 0; j < phoneNumbersByHashName.get(i).size(); j++) {
                        line += ";" + phoneNumbersByHashName.get(i).get(j);
                    }
                    if(names.get(i).equals(name)){
                        line += ";" + newPhone;
                    }
                    fw.write(line + "\n");
                }
                fw.flush();
                readFile(filePath, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
                System.out.println("Номер успешно добавлен!");
                System.out.println("********************************************************\n");

            }else {
                for (int i = 0; i < hashesOfEqualsNames.get(name).size(); i++) {
                    int hashName = hashesOfEqualsNames.get(name).get(i);
                    System.out.println("Хэш: " + hashName + "\n" + name);
                    for (int j = 0; j < phoneNumbersByHashName.get(hashName).size(); j++) {
                        String phoneNumber = phoneNumbersByHashName.get(hashName).get(j);
                        System.out.println("\t"+ phoneNumber);
                    }
                }
                System.out.print("Введите номер Хэша нужного человека: ");
                String hash = sc1.nextLine();
                if(!hashesOfEqualsNames.get(name).contains(Integer.parseInt(hash))){
                    System.out.println("Этого хэша с таким именем нет в базе данных");
                    System.out.println("********************************************************\n");
                    return;
                } else {
                    for (int i = 0; i < names.size(); i++) {
                        String line = names.get(i);
                        for (int j = 0; j < phoneNumbersByHashName.get(i).size(); j++) {
                            line += ";" + phoneNumbersByHashName.get(i).get(j);
                        }
                        if(i == Integer.parseInt(hash)){
                            line += ";" + newPhone;
                        }
                        fw.write(line + "\n");
                    }
                    fw.flush();
                    readFile(filePath, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
                    System.out.println("Номер успешно добавлен!");
                    System.out.println("********************************************************\n");
                }
            }


        } catch (Exception ex){
            System.out.println("Ошибка записи");
        }
    }
    public static void deleteName(String filePath, Map<Integer, String> names, Map<String, Integer> phones,
                                  Map<String, ArrayList<Integer>> hashesOfEqualsNames,
                                  Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        System.out.print("Введите имя для удаления: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();

        if(!hashesOfEqualsNames.containsKey(name)){
            System.out.println("Такого имени нет в базе данных");
            System.out.println("********************************************************\n");
        }else {
            try{
                FileWriter fw = new FileWriter(filePath);

                if(hashesOfEqualsNames.get(name).size() == 1) {
                    for (int i = 0; i < names.size(); i++) {
                        String line = names.get(i);
                        for (int j = 0; j < phoneNumbersByHashName.get(i).size(); j++) {
                            line += ";" + phoneNumbersByHashName.get(i).get(j);
                        }
                        if(!names.get(i).equals(name)) {
                            fw.write(line + "\n");
                        }
                    }
                    fw.flush();
                    readFile(filePath, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
                    System.out.println("Имя успешно удалено!");
                    System.out.println("********************************************************\n");

                }else {
                    for (int i = 0; i < hashesOfEqualsNames.get(name).size(); i++) {
                        int hashName = hashesOfEqualsNames.get(name).get(i);
                        System.out.println("Хэш: " + hashName + "\n" + name);
                        for (int j = 0; j < phoneNumbersByHashName.get(hashName).size(); j++) {
                            String phoneNumber = phoneNumbersByHashName.get(hashName).get(j);
                            System.out.println("\t"+ phoneNumber);
                        }
                    }
                    System.out.print("Введите номер Хэша нужного человека: ");
                    String hash = sc1.nextLine();
                    if(!hashesOfEqualsNames.get(name).contains(Integer.parseInt(hash))){
                        System.out.println("Этого хэша с таким именем нет в базе данных");
                        System.out.println("********************************************************\n");
                        return;
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            String line = names.get(i);
                            for (int j = 0; j < phoneNumbersByHashName.get(i).size(); j++) {
                                line += ";" + phoneNumbersByHashName.get(i).get(j);
                            }
                            if(i != Integer.parseInt(hash)) {
                                fw.write(line + "\n");
                            }
                        }
                        fw.flush();
                        readFile(filePath, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
                        System.out.println("Имя успешно удалено!");
                        System.out.println("********************************************************\n");
                    }
                }

            } catch (Exception ex){
                System.out.println("Ошибка записи");
            }
        }
    }
    public static void deletePhoneNumber(String filePath, Map<String, Integer> phones,  Map<Integer, String> names,
                                         Map<String, ArrayList<Integer>> hashesOfEqualsNames,
                                         Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        System.out.print("Введите номер телефона для удаления: ");
        Scanner sc1 = new Scanner(System.in);
        String phoneNumber = sc1.nextLine();

        if(!phones.containsKey(phoneNumber)){
            System.out.println("Такого номера телефона нет в базе данных");
            System.out.println("********************************************************\n");
        }else {
            try {
                FileWriter fw = new FileWriter(filePath);

                for (int i = 0; i < names.size(); i++) {
                    String line = names.get(i);
                    for (int j = 0; j < phoneNumbersByHashName.get(i).size(); j++) {
                        if(!phoneNumber.equals(phoneNumbersByHashName.get(i).get(j))) {
                            line += ";" + phoneNumbersByHashName.get(i).get(j);
                        }
                    }
                    fw.write(line + "\n");
                }
                fw.flush();
                readFile(filePath, phones, names, hashesOfEqualsNames, phoneNumbersByHashName);
                System.out.println("Номер успешно удален!");
                System.out.println("********************************************************\n");

            } catch (Exception ex) {
                System.out.println("Ошибка записи");
            }
        }
    }
    public static void showAllNamesWithPhoneNumbers(Map<Integer, String> names,
                                                    Map<Integer, ArrayList<String>> phoneNumbersByHashName){
        for (int i = 0; i < names.size(); i++) {
            String line = names.get(i) + " -";
            for (int j = 0; j < phoneNumbersByHashName.get(i).size(); j++) {
                line += " " + phoneNumbersByHashName.get(i).get(j) + ",";
            }
            System.out.println(line.substring(0, line.length() - 1) + ";");
        }
        System.out.println("********************************************************\n");
    }
}
