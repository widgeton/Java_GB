package terminal;

public class CommandFormer extends CommandParser {
    private String[] commands;

    public CommandFormer(String[] commands) {
        this.commands = commands;
    }

    private boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public boolean checkCommand() {
        if (commands.length > 0)
            return commands[0].startsWith("/");
        return false;
    }

    public boolean checkName() {
        if(commands.length > 3) {
            for (int i = 1; i < 4; i++) {
                if (isInt(commands[i])) {
                    return false;
                }
            }
            return true;
        } else return false;
    }

    public boolean checkGroupNumber() {
        return commands.length > 4 && isInt(commands[4]);
    }

    public boolean checkYearOfBirthday() {
        return commands.length > 5 && isInt(commands[5]) && commands[5].length() == 4;
    }

    public boolean checkPassNumber() {

    }

}
