package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import service.user.StudentService;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.CreateStudentExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class CreateUserExecutableFactory implements CommandUserExecutableFactory{
    private final StudentService studentService;

    public CreateUserExecutableFactory(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new CreateStudentExecutable(studentService, (Student) user);
        } return new NoneCommandExecutable();
    }
}
