package terminal.executable.factorys;

import terminal.Command;
import terminal.displayed.ResultDisplayedFactory;
import terminal.executable.executables.CommandExecutable;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    private final ResultDisplayedFactory resultDisplayedFactory;

    public LoggingCommandExecutableFactory(ResultDisplayedFactory resultDisplayedFactory) {
        this.resultDisplayedFactory = resultDisplayedFactory;
    }

    @Override
    public CommandExecutable create(Command command) {
        System.out.println(command);

        CommandExecutable commandExecutable = super.create(command);

        resultDisplayedFactory.create(command, commandExecutable).display();

        return commandExecutable;
    }
}
