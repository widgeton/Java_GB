package repository;

import data.user.Student;

public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public void save(Student entity) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
