package terminal.displayed;

public class StudentMenu {
    public static void displayMenu(){
        System.out.println("Для работы со студентом введите команду и данные студента через пробел.");
        System.out.println("Примеры: /add /student Иванов Иван Иванович,\n" +
                "         /delete /student Иванов Иван Иванович");
    }
}
