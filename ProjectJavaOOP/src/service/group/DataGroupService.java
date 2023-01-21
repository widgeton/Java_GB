package service.group;

import data.group.Group;
import repository.GroupRepository;

public abstract class DataGroupService {

    private final GroupRepository groupRepository;

    public DataGroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public abstract void sort(Group group);

    public void save(Group group) {
        groupRepository.save(group);
    }


}
