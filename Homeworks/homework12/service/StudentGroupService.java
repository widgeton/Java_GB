package service;

import data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    public StudentGroup readGroup(int groupNumber, String path) {
        DataService studentService = new StudentService();
        DataService teacherService = new TeacherService();

        List<User> students = studentService.read(path);
        List<User> teachers = teacherService.read(path);

        List<Student> studentsOfGroup = new ArrayList<>();
        Teacher teacherOfGroup = null;

        for (User student : students) {
            if (((Student) (student)).getGroupNumber() == groupNumber) {
                studentsOfGroup.add((Student) student);
            }
        }

        for (User teacher : teachers) {
            if (((Teacher) (teacher)).getGroups().contains(groupNumber)) {
                teacherOfGroup = (Teacher) (teacher);
                break;
            }
        }

        return new StudentGroup(teacherOfGroup, studentsOfGroup, groupNumber);
    }

    public void removeStudent(String fio, StudentGroup studentGroup) {
        Iterator<Student> studentGroupIterator = studentGroup.iterator();
        while (studentGroupIterator.hasNext()) {
            if (studentGroupIterator.next().getFio().equals(fio)) {
                studentGroupIterator.remove();
            }
        }
    }

    public void sortStudents(StudentGroup studentGroup){
        Collections.sort(studentGroup.getStudents());
    }
    public void sortStudentsByFio(StudentGroup studentGroup){
        studentGroup.getStudents().sort(new UserComparator());
    }
}
