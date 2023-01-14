package terminal.displayed;

import terminal.executable.CommandExecutable;

public class DeleteStudentDisplayed implements ResultDisplayed {

    private final CommandExecutable commandExecutable;

    public DeleteStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void display() {
        if (commandExecutable == null) {
            System.out.println("Неверный ввод. Студент не был удален");
        } else {
            System.out.println("Студент успешно удален");
        }
    }

}
