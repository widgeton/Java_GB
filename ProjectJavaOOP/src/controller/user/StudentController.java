package controller.user;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;

import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentService studentService;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
    }

    @Override
    public void write(Student student) {
        studentService.write(student);
    }

    @Override
    public List<Student> read(String path) {
        return studentService.read(path);
    }

    @Override
    public void save(Student entity) {
        studentService.saveStudent(entity);
    }

    @Override
    public Student findById(int id) {
        return studentService.findStudentById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentService.findStudentByFio(fio);
    }
}
