package service.group;

import data.comparator.UserComparator;
import data.group.Group;
import data.group.StudentGroup;
import data.user.Student;
import data.user.Teacher;
import data.user.User;
import repository.Repository;
import repository.StudentRepository;
import service.user.DataUserService;
import service.user.StudentService;
import service.user.TeacherService;
import util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService implements DataGroupService {
    private final Repository<Group, Integer> repository;

    public StudentGroupService(Repository<Group, Integer> repository) {
        this.repository = repository;
    }

    public StudentGroup readGroup(int groupNumber, String path) {


        return null;
    }

    public void removeStudent(String fio, StudentGroup studentGroup) {
        Iterator<Student> studentGroupIterator = studentGroup.iterator();
        while (studentGroupIterator.hasNext()) {
            if (studentGroupIterator.next().getFio().equals(fio)) {
                studentGroupIterator.remove();
            }
        }
    }

    @Override
    public void sort(Group studentGroup) {
        Collections.sort(((StudentGroup) (studentGroup)).getStudents());
    }

    public void sortStudentsByFio(StudentGroup studentGroup) {
        studentGroup.getStudents().sort(new UserComparator());
    }

    public void saveGroup(Group studentGroup) {
        repository.save(studentGroup);
    }

    public Group findGroupById(Integer id) {
        return repository.findById(id);
    }
}
