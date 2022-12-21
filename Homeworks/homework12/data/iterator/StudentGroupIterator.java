package data.iterator;

import data.user.Student;
import data.group.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudents();
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();
    }

    @Override
    public Student next() {
        return students.get(cursor++);
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
    }
}
