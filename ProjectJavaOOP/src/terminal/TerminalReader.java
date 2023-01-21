package terminal;

import terminal.executable.executables.CommandExecutable;
import terminal.executable.factorys.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = new CommandParser();
        this.commandExecutableFactory = commandExecutableFactory;
    }


    public void listenToCommands() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Ввод: ");
            String input = scan.nextLine();
            Command command = commandParser.parseCommand(input);

            CommandExecutable commandExecutable = commandExecutableFactory.create(command);
            commandExecutable.execute();
        }
    }
}
