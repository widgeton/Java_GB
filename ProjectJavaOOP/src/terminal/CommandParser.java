package terminal;

import java.util.Arrays;
import java.util.List;

public interface CommandParser {

    default List<String> parseCommand(String inputCommand){
        return Arrays.stream(inputCommand.split(" ")).toList();
    };
}
