package terminal.executable;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.StudentFormer;

import java.util.List;

public class CommandExecutableFactory {
    public CommandExecutable create(List<String> input) {
        Student student = new StudentFormer(input).createStudent();
        if (input.get(0).equals("/add") && student != null) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), student);
        } else if (input.get(0).equals("/delete") && student != null) {
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()), student);
        } else return new NoneCommandExecutable();
    }
}
