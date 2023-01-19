package terminal.executable.factorys;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.Command;
import terminal.executable.formers.StudentFormer;
import terminal.executable.executables.*;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    @Override
    public CommandExecutable create(Command command) {
        Student student = new StudentFormer(command.getCommands()).createUser();
        if (command.isAddCommand() && student != null) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), student);
        } else if (command.isDeleteCommand() && student != null) {
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()), student);
        } else return new NoneCommandExecutable();
    }
}
