package controller;

import data.GroupStream;
import data.StudentGroup;
import data.User;
import service.DataService;
import service.GroupStreamService;
import service.StudentGroupService;
import service.StudentService;

import java.util.List;

public class Controller {
    private DataService studentService;
    private StudentGroupService studentGroupService;
    private GroupStreamService groupStreamService;

    public Controller(DataService studentService, StudentGroupService studentGroupService,
                      GroupStreamService groupStreamService) {
        this.studentService = studentService;
        this.studentGroupService = studentGroupService;
        this.groupStreamService = groupStreamService;
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
    public void sortGroupStreams(List<GroupStream> groupStreams){
        groupStreamService.sortGroupStreams(groupStreams);
    }
}
