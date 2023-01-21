package terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {
    private static final String ADD = "/add";
    private static final String DELETE = "/delete";
    private static final String STUDENT = "/student";

    private final ArrayList<String> commands;
    private final String mainCommand;

    public Command(ArrayList<String> commands) {
        this.commands = commands;
        this.mainCommand = commands.get(0);
    }

    public ArrayList<String> getCommands() {
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
        return commands.size() > 1 && commands.get(1).equals(STUDENT);
    }

    @Override
    public String toString() {
        return String.join(" ", commands);
    }
}
