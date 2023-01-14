package terminal.displayed;

import terminal.executable.CommandExecutable;

public class ResultDisplayedFactory {
    private final CommandExecutable commandExecutable;

    public ResultDisplayedFactory(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    public ResultDisplayed create(String command){
        if (command.equals("/add")){
            return new CreateStudentDisplayed(commandExecutable);
        } else if (command.equals("/delete")){
            return new DeleteStudentDisplayed(commandExecutable);
        }
        return null;
    }

}
