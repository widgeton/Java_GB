import terminal.CommandParser;
import terminal.TerminalReader;
import terminal.displayed.ResultDisplayedFactory;
import terminal.displayed.StudentMenu;
import terminal.executable.factorys.CommandsFactory;
import terminal.executable.factorys.LoggingCommandExecutableFactory;
import terminal.executable.factorys.UserFormerFactory;


public class Main {
    public static void main(String[] args) {
        new StudentMenu().displayMenu();

        TerminalReader.getInstance(new CommandParser(),
                new LoggingCommandExecutableFactory(new ResultDisplayedFactory(), new UserFormerFactory(),
                        new CommandsFactory())).listenToCommands();
    }
}
