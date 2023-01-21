package service.user;

import data.user.Teacher;
import data.user.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements DataUserService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void write(Teacher user) {
        WriterToTxt.write(user);
    }

    @Override
    public List<Teacher> read(String path) {
        List<Teacher> teachers = new ArrayList<>();
        List<User> users = ReaderFromTxt.read(path);

        for (User user : users) {
            if (user instanceof Teacher) {
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    @Override
    public void saveUser(Teacher user) {

    }

    @Override
    public void deleteUser(Teacher user) {

    }


}
