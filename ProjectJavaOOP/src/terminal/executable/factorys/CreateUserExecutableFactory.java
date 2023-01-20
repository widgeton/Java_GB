package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.CreateStudentExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class CreateUserExecutableFactory implements CommandUserExecutableFactory{
    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), (Student) user);
        } return new NoneCommandExecutable();
    }
}
