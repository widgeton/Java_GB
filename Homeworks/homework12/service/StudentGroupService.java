package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    public StudentGroup readGroup(int groupNumber, String path){
        DataService studentService = new StudentService();
        DataService teacherService = new TeacherService();

        List<User> students = studentService.read(path);
        List<User> teachers = teacherService.read(path);

        List<Student> studentsOfGroup = new ArrayList<>();
        Teacher teacherOfGroup = null;

        for (User student : students) {
            if (((Student)(student)).getGroupNumber() == groupNumber){
                studentsOfGroup.add((Student)student);
            }
        }

        for (User teacher : teachers) {
            if(((Teacher)(teacher)).getGroups().contains(groupNumber)){
                teacherOfGroup = (Teacher)(teacher);
                break;
            }
        }

        return new StudentGroup(teacherOfGroup, studentsOfGroup, groupNumber);
    }
}
