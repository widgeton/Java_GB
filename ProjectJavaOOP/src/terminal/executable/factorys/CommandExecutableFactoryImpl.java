package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.Command;
import terminal.executable.executables.*;
import terminal.executable.formers.StudentFormer;
import terminal.executable.formers.UserFormer;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    private final UserFormerFactory userFormerFactory;
    private final CommandsFactory commandsFactory;
    protected final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
        this.userFormerFactory = new UserFormerFactory();
        this.commandsFactory = new CommandsFactory(studentService);
    }

    @Override
    public CommandExecutable create(Command command) {
        UserFormer userFormer = userFormerFactory.createUserFormer(command);
        User user = userFormer.createUser();

        if (user != null) {
           CommandUserExecutableFactory commandUserExecutableFactory = commandsFactory.createCommandFactory(command);
           return commandUserExecutableFactory.createCommandExecutable(user);
        } else return new NoneCommandExecutable();
    }
}
