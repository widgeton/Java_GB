package terminal.executable;

import terminal.Command;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
