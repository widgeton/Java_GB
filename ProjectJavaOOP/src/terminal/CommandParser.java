package terminal;

public class CommandParser {

    public Command parseCommand(String inputCommand) {
        return new Command(inputCommand);
    }
}
