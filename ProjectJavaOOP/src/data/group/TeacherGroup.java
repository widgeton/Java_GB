package data.group;

import data.user.User;

import java.util.List;

public class TeacherGroup extends UserGroup implements Comparable<TeacherGroup> {
    private final String department;

    public TeacherGroup(List<User> teachers, String department) {
        super(teachers);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(TeacherGroup o) {
        return Integer.compare(this.getUsers().size(), o.getUsers().size());
    }
}
