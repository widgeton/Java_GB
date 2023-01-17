package data.user;

import java.util.List;

public class Teacher extends User {
    private String department;
    private List<Integer> groups;

    public Teacher(String fio, int yearOfBirth, Integer passportNumber, String department, List<Integer> groups) {
        super(fio, yearOfBirth, passportNumber);
        this.department = department;
        this.groups = groups;
    }

    public List<Integer> getGroups() {
        return groups;
    }
}
