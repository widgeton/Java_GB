package controller;

import data.StudentGroup;
import data.User;
import service.StudentGroupService;
import service.StudentService;

public class Controller {
    private StudentService ss;
    private StudentGroupService sgs;

    public Controller() {
        this.ss = new StudentService();
        this.sgs = new StudentGroupService();
    }
    public User createStudent(User student){
        ss.write(student);
        return ss.read(student);
    }
    public StudentGroup createGroup(int groupNumber){
        return sgs.readGroup(groupNumber);
    }
}
