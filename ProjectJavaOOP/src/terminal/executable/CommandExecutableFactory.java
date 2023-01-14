package terminal.executable;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;

public class CommandExecutableFactory {
    public CommandExecutable create(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), new Student(input[1]));
        } else if (input[0].equals("/delete")) {
            if (input.length == 2) {
                return new DeleteStudentExecutable(new StudentService(new StudentRepository()), new Student(input[1]));
            } else if (input.length == 3 && isInt(input[1]) && isInt(input[2])) {
                return new DeleteStudentExecutable(new StudentService(new StudentRepository()),
                        new Student(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            }
        }
        return null;
    }

    private boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
