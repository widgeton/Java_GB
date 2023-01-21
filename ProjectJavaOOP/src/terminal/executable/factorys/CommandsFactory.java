package terminal.executable.factorys;

import service.user.StudentService;
import terminal.Command;

public class CommandsFactory {
    private final StudentService studentService;

    public CommandsFactory(StudentService studentService) {
        this.studentService = studentService;
    }

    public CommandUserExecutableFactory createCommandFactory(Command command){
        if(command.isAddCommand()){
            return new CreateUserExecutableFactory(studentService);
        } else if (command.isDeleteCommand()){
            return new DeleteUserExecutableFactory(studentService);
        } else return new NoneCommandUserExecutableFactory();
    }
}
