package terminal;

import terminal.displayed.ResultDisplayed;
import terminal.displayed.ResultDisplayedFactory;
import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public void listenToCommands() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String[] commands = commandParser.parseCommand(input);

            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(commands);
            commandExecutable.execute();

            ResultDisplayedFactory resultDisplayedFactory = new ResultDisplayedFactory(commandExecutable);
            ResultDisplayed resultDisplayed = resultDisplayedFactory.create(commands[0]);
            resultDisplayed.display();
        }
    }
}
