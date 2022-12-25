package service.group;

import data.group.TeacherGroup;
import repository.GroupRepository;


public class TeacherGroupService extends DataUserGroupService {
    public TeacherGroupService(GroupRepository repository) {
        super(repository);
    }

    public TeacherGroup readTeacherGroup(String path, String department) {
        return null;
    }
}
