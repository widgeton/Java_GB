package service.user;

import data.user.Student;
import data.user.User;
import repository.StudentRepository;
import util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataUserService<Student> {
    private final StudentRepository studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository();
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

    @Override
    public void saveUser(Student user) {
        studentRepository.save(user);
    }

    @Override
    public void deleteUser(Student user) {
        studentRepository.delete(user);
    }
    public ArrayList<Student> getUsersList(){
        return studentRepository.getUsersList();
    }


}
