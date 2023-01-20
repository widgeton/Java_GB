package terminal.executable.formers;

import data.user.User;

import java.util.List;

public abstract class UserFormer {
    protected final List<String> commands;

    public UserFormer(List<String> commands) {
        this.commands = commands;
    }

    protected boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    protected String formName() {
        String name = null;
        for (int i = 2; i < commands.size(); i++) {
            if (!isInt(commands.get(i)) && commands.size() - i > 2 &&
                    !isInt(commands.get(i + 1)) && !isInt(commands.get(i + 2))) {
                name = String.join(" ", commands.get(i), commands.get(i + 1), commands.get(i + 2));
                commands.remove(commands.get(i));
                commands.remove(commands.get(i + 1));
                commands.remove(commands.get(i + 2));
                break;
            }
        }
        return name;
    }


    protected Integer formYearOfBirth() {
        Integer yearOfBirth = null;
        for (String i : commands) {
            if (isInt(i) && i.length() == 4) {
                yearOfBirth = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return yearOfBirth;
    }

    protected Integer formPassNumber() {
        Integer passNumber = null;
        for (String i : commands) {
            if (isInt(i) && i.length() == 10) {
                passNumber = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return passNumber;
    }

    public abstract User createUser();
}
