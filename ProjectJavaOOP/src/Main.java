import terminal.CommandParser;
import terminal.TerminalReader;
import terminal.displayed.ResultDisplayedFactory;
import terminal.displayed.StudentMenu;
import terminal.executable.factorys.LoggingCommandExecutableFactory;


public class Main {
    public static void main(String[] args) {
        new StudentMenu().displayMenu();

        TerminalReader.getInstance(new CommandParser(),
                new LoggingCommandExecutableFactory(new ResultDisplayedFactory())).listenToCommands();
    }
}
