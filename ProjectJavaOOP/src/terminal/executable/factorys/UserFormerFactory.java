package terminal.executable.factorys;

import terminal.Command;
import terminal.executable.formers.NoneUserFormer;
import terminal.executable.formers.StudentFormer;
import terminal.executable.formers.UserFormer;

public class UserFormerFactory {
    public UserFormer createUserFormer(Command command) {
        if (command.isStudentCommand()) {
            return new StudentFormer(command.getCommands());
        } else return new NoneUserFormer(command.getCommands());
    }
}
