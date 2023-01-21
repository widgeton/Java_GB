package repository;

import data.user.Student;
import data.user.User;
import db.StudentTable;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Repository<Student> {
    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
    }


    @Override
    public void save(Student entity) {
        studentTable.save(entity);
    }

    @Override
    public void delete(Student entity) {
        studentTable.deleteByFio(entity.getFio());
    }

    public ArrayList<Student> getUsersList() {
        return studentTable.getElements();
    }

}
