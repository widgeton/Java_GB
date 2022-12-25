package controller.group;

import data.group.StudentGroup;
import data.user.Student;
import service.group.StudentGroupService;

public class StudentGroupController implements UserGroupController<StudentGroup, Student>{

    private final StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public void sort(StudentGroup group) {
        studentGroupService.sort(group);
    }

    @Override
    public StudentGroup findById(int id) {
        return (StudentGroup) studentGroupService.findById(id);
    }

    @Override
    public void save(StudentGroup group) {
        studentGroupService.save(group);
    }

    @Override
    public void remove(Student student, StudentGroup group) {
        studentGroupService.removeUser(student, group);
    }

    public StudentGroup readGroup(String path, int groupNumber) {
        return studentGroupService.readStudentGroup(path, groupNumber);
    }

    @Override
    public void sortByFio(StudentGroup group) {
        studentGroupService.sort(group);
    }
}
