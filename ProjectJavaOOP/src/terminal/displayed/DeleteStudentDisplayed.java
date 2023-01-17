package terminal.displayed;

import terminal.executable.CommandExecutable;
import terminal.executable.NoneCommandExecutable;

public class DeleteStudentDisplayed implements ResultDisplayed {

    private final CommandExecutable commandExecutable;

    public DeleteStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void display() {
        if (commandExecutable instanceof NoneCommandExecutable) {
            System.out.println("Неверный ввод. Студент не был удален");
        } else {
            System.out.println("Студент успешно удален");
        }
    }

}
