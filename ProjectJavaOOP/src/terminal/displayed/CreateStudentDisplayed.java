package terminal.displayed;

import terminal.executable.CommandExecutable;

public class CreateStudentDisplayed implements ResultDisplayed {

    private final CommandExecutable commandExecutable;

    public CreateStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void display() {
        if (commandExecutable == null) {
            System.out.println("Неверный ввод. Студент не был создан");
        } else {
            System.out.println("Студент успешно создан");
        }
    }


}
