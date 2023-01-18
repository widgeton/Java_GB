package terminal;

import terminal.executable.CommandExecutableFactory;
import terminal.executable.LoggingCommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
                                             CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }


    public void listenToCommands() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            Command command = commandParser.parseCommand(input);

            commandExecutableFactory.create(command);
        }
    }
}
