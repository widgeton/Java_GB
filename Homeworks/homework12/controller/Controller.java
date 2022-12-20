package controller;

import data.StudentGroup;
import data.User;
import service.DataService;
import service.StudentGroupService;
import service.StudentService;

import java.util.List;

public class Controller {
    private DataService studentService;
    private StudentGroupService studentGroupService;

    public Controller(DataService studentService, StudentGroupService studentGroupService) {
        this.studentService = studentService;
        this.studentGroupService = studentGroupService;
    }

    public void writeStudent(User student){
        studentService.write(student);
    }
    public List<User> readUsersFromTxt(String path){
        return studentService.read(path);
    }
    public StudentGroup createGroup(int groupNumber, String path){
        return studentGroupService.readGroup(groupNumber, path);
    }
    public void removeStudent (String fio, StudentGroup studentGroup){
        studentGroupService.removeStudent(fio, studentGroup);
    }
}
