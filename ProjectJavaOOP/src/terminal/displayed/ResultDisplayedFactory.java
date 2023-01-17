package terminal.displayed;

import terminal.executable.CommandExecutable;

public class ResultDisplayedFactory {

    public ResultDisplayed create(String command, CommandExecutable commandExecutable) {
        if (command.equals("/add")) {
            return new CreateStudentDisplayed(commandExecutable);
        } else if (command.equals("/delete")) {
            return new DeleteStudentDisplayed(commandExecutable);
        } else return new NoneResultDisplayed();
    }

}
