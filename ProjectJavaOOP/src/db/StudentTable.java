package db;

import data.user.Student;

public class StudentTable extends Table<Student>{
    public boolean deleteByFio(String fio){
        for (Student student : elements) {
            if(student.getFio().equals(fio)){
                elements.remove(student);
                return true;
            }
        }
        return false;
    }
}
