package data.group;

import data.user.Teacher;
import data.user.User;

import java.util.List;

public class StudentGroup extends UserGroup implements Comparable<StudentGroup> {
    private final Teacher teacher;
    private final int groupNumber;

    public StudentGroup(Teacher teacher, List<User> students, int groupNumber) {
        super(students);
        this.teacher = teacher;
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.groupNumber, o.groupNumber);
    }
}
