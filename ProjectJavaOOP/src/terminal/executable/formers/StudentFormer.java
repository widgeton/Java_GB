package terminal.executable.formers;

import data.user.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentFormer extends UserFormer{

    public StudentFormer(ArrayList<String> commands) {
        super(commands);
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

    public Student createUser() {
        int lengthBefore = commands.size();
        String name = formName();
        Integer yearOfBirth = formYearOfBirth();
        Integer passNumber = formPassNumber();
        Integer groupNumber = formGroupNumber();
        if (lengthBefore > commands.size())
            return new Student(name, yearOfBirth, passNumber, groupNumber);
        else return null;
    }
}
