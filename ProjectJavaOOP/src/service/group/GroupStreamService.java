package service.group;

import data.comparator.UserGroupComparator;
import data.group.Group;
import data.group.GroupStream;
import repository.GroupRepository;


public class GroupStreamService implements DataGroupService {

    private final GroupRepository groupRepository;

    public GroupStreamService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void sort(Group groupStreams) {
        ((GroupStream) (groupStreams)).getGroups().sort(new UserGroupComparator());
    }

    @Override
    public void save(Group group) {
        groupRepository.save(group);
    }

    @Override
    public Group findById(int id) {
        return groupRepository.findById(id);
    }


}
