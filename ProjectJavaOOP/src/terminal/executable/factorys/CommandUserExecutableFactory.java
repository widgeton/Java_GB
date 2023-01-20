package terminal.executable.factorys;

import data.user.User;
import terminal.executable.executables.CommandExecutable;

public interface CommandUserExecutableFactory {
    CommandExecutable createCommandExecutable(User user);
}
