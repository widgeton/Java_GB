package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import service.user.StudentService;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.DeleteStudentExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class DeleteUserExecutableFactory implements CommandUserExecutableFactory{
    private StudentService studentService;

    public DeleteUserExecutableFactory(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new DeleteStudentExecutable(studentService, (Student) user);
        } return new NoneCommandExecutable();
    }
}
