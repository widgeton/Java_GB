package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.DeleteStudentExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class DeleteUserExecutableFactory implements CommandUserExecutableFactory{
    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()), (Student) user);
        } return new NoneCommandExecutable();
    }
}
