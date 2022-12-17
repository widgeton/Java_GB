package controller;

import data.User;
import service.DataService;

public class Controller {
    private DataService ss;

    public Controller(DataService ss) {
        this.ss = ss;
    }
    public User createStudent(User student){
        ss.write(student);
        return ss.read(student);
    }
}
