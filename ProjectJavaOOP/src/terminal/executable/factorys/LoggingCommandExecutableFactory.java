package terminal.executable.factorys;

import service.user.StudentService;
import terminal.Command;
import terminal.displayed.ResultDisplayedFactory;
import terminal.executable.executables.CommandExecutable;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    private final ResultDisplayedFactory resultDisplayedFactory;

    public LoggingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
        this.resultDisplayedFactory = new ResultDisplayedFactory();
    }

    @Override
    public CommandExecutable create(Command command) {
        System.out.printf("Вы ввели: %s\n", command);

        CommandExecutable commandExecutable = super.create(command);

        resultDisplayedFactory.create(command, commandExecutable).display();

        return commandExecutable;
    }
}
