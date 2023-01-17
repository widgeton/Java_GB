package terminal;

import data.user.Student;

import java.util.List;

public class StudentFormer {
    private final List<String> commands;

    public StudentFormer(List<String> commands) {
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


    private String formName() {
        String name = null;
        for (int i = 1; i < commands.size(); i++) {
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


    private Integer formYearOfBirth() {
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

    private Integer formPassNumber() {
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

    private Integer formGroupNumber() {
        Integer groupNumber = null;
        for (String i : commands) {
            if (isInt(i)) {
                groupNumber = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return groupNumber;
    }

    public Student createStudent() {
        int lengthBefore = commands.size();
        String name = formName();
        Integer yearOfBirth = formYearOfBirth();
        Integer passNumber = formPassNumber();
        Integer groupNumber = formGroupNumber();
        if (lengthBefore < commands.size())
            return new Student(name, yearOfBirth, passNumber, groupNumber);
        else return null;
    }
}
