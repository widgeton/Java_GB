package terminal;

public interface CommandParser {
    default String[] parseCommand(String inputCommand){
        return null;
    };
}
