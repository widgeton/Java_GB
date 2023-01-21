package terminal.executable.formers;

import data.user.User;

import java.util.ArrayList;

public abstract class UserFormer {
    protected ArrayList<String> commands;

    protected UserFormer(ArrayList<String> commands) {
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
                commands.remove(i);
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
