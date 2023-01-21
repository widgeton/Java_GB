package terminal.executable.executables;

import data.user.Student;
import service.user.StudentService;

public class DeleteStudentExecutable implements CommandExecutable {
    private final StudentService studentService;
    private final Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteUser(student);
        System.out.println(studentService.getUsersList());
    }
}
