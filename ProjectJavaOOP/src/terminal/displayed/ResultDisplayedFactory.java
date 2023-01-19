package terminal.displayed;

import terminal.Command;
import terminal.executable.executables.CommandExecutable;

public class ResultDisplayedFactory {

    public ResultDisplayed create(Command command, CommandExecutable commandExecutable) {
        if (command.isAddCommand()) {
            return new CreateStudentDisplayed(commandExecutable);
        } else if (command.isDeleteCommand()) {
            return new DeleteStudentDisplayed(commandExecutable);
        } else return new NoneResultDisplayed();
    }

}
