package controller;

import data.group.Group;
import data.group.GroupStream;
import data.group.StudentGroup;
import data.user.User;
import service.user.DataUserService;
import service.group.GroupStreamService;
import service.group.StudentGroupService;

import java.util.List;

public class Controller {
    private DataUserService studentService;
    private StudentGroupService studentGroupService;
    private GroupStreamService groupStreamService;

    public Controller(DataUserService studentService, StudentGroupService studentGroupService,
                      GroupStreamService groupStreamService) {
        this.studentService = studentService;
        this.studentGroupService = studentGroupService;
        this.groupStreamService = groupStreamService;
    }

    public void writeStudent(User student) {
        studentService.write(student);
    }

    public List<User> readUsersFromTxt(String path) {
        return studentService.read(path);
    }

    public StudentGroup createGroup(int groupNumber, String path) {
        return studentGroupService.readGroup(groupNumber, path);
    }

    public void removeStudent(String fio, StudentGroup studentGroup) {
        studentGroupService.removeStudent(fio, studentGroup);
    }

    public void sortStudents(StudentGroup studentGroup) {
        studentGroupService.sort(studentGroup);
    }

    public void sortGroupStreams(GroupStream groupStreams) {
        groupStreamService.sort(groupStreams);
    }
}
