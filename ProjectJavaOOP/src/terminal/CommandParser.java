package terminal;

import java.util.Arrays;
import java.util.List;

public interface CommandParser {

    default Command parseCommand(String inputCommand){
        return new Command(inputCommand);
    };
}
