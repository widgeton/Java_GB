package controller.user;

import data.user.Teacher;
import service.user.TeacherService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void write(Teacher teacher) {
        teacherService.write(teacher);
    }

    @Override
    public List<Teacher> read(String path) {
        return teacherService.read(path);
    }

    @Override
    public void save(Teacher entity) {
        teacherService.saveTeacher(entity);
    }

    @Override
    public Teacher findById(int id) {
        return teacherService.findTeacherById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherService.findStudentByFio(fio);
    }
}
