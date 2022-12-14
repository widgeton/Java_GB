package service.user;

import data.user.Student;
import data.user.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.util.List;

public class StudentService implements DataUserService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public List<User> read(String path) {
        return ReaderFromTxt.read(path);
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
}
