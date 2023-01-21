package terminal.displayed;

import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class DeleteStudentDisplayed implements ResultDisplayed {

    private final CommandExecutable commandExecutable;

    public DeleteStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void display() {
        if (commandExecutable instanceof NoneCommandExecutable) {
            System.out.println("Неверный ввод. Студент не был удален\n");
        } else {
            System.out.println("Студент успешно удален\n");
        }
    }

}
