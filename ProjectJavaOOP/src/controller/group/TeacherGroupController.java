package controller.group;

import data.group.TeacherGroup;
import data.user.Teacher;
import service.group.TeacherGroupService;

public class TeacherGroupController implements UserGroupController<TeacherGroup, Teacher> {
    private final TeacherGroupService teacherGroupService;

    public TeacherGroupController(TeacherGroupService teacherGroupService) {
        this.teacherGroupService = teacherGroupService;
    }

    @Override
    public void sort(TeacherGroup group) {
        teacherGroupService.sort(group);
    }

    @Override
    public TeacherGroup findById(int id) {
        return (TeacherGroup) teacherGroupService.findById(id);
    }

    @Override
    public void save(TeacherGroup group) {
        teacherGroupService.save(group);
    }

    @Override
    public void remove(Teacher teacher, TeacherGroup group) {
        teacherGroupService.removeUser(teacher, group);
    }

    public TeacherGroup readGroup(String path, String department) {
        return teacherGroupService.readTeacherGroup(path, department);
    }

    @Override
    public void sortByFio(TeacherGroup group) {
        teacherGroupService.sort(group);
    }
}
