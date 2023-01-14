package service.user;

import data.user.Student;
import data.user.User;
import repository.StudentRepository;
import util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataUserService<Student> {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void write(Student user) {

    }

    @Override
    public List<Student> read(String path) {
        List<Student> students = new ArrayList<>();
        List<User> users = ReaderFromTxt.read(path);

        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    public void saveStudent(Student entity) {
        studentRepository.save(entity);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
