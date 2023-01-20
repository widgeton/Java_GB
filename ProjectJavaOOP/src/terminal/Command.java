package terminal;

import java.util.Arrays;
import java.util.List;

public class Command {
    private static final String ADD = "/add";
    private static final String DELETE = "/delete";
    private static final String STUDENT = "/student";

    private final List<String> commands;
    private final String mainCommand;

    public Command(String input) {
        this.commands = Arrays.stream(input.split(" ")).toList();
        this.mainCommand = commands.get(0);
    }

    public List<String> getCommands() {
        return commands;
    }

    public String getMainCommand() {
        return mainCommand;
    }

    public boolean isAddCommand() {
        return commands.get(0).equals(ADD);
    }


    public boolean isDeleteCommand() {
        return commands.get(0).equals(DELETE);
    }
    public boolean isStudentCommand() {
        return commands.get(1).equals(STUDENT);
    }

    @Override
    public String toString() {
        return String.join(" ", commands);
    }
}
