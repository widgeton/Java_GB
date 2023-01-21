package controller.user;

import data.user.Student;
import service.user.StudentService;

import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
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
        studentService.saveUser(entity);
    }

    @Override
    public void delete(Student entity) {
        studentService.deleteUser(entity);
    }

}
