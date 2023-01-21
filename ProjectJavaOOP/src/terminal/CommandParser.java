package terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParser {

    public Command parseCommand(String inputCommand) {
        return new Command(new ArrayList<>(List.of(inputCommand.split(" "))));
    }
}
