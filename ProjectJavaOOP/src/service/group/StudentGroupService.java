package service.group;

import data.group.StudentGroup;
import repository.GroupRepository;

public class StudentGroupService extends DataUserGroupService {

    public StudentGroupService(GroupRepository repository) {
        super(repository);
    }

    public StudentGroup readStudentGroup(String path, int groupNumber) {
        return null;
    }

}
