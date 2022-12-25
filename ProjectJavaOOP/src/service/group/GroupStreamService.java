package service.group;

import data.comparator.UserGroupComparator;
import data.group.Group;
import data.group.GroupStream;
import repository.GroupRepository;


public class GroupStreamService extends DataGroupService {


    public GroupStreamService(GroupRepository groupRepository) {
        super(groupRepository);
    }

    @Override
    public void sort(Group groupStreams) {
        ((GroupStream) (groupStreams)).getGroups().sort(new UserGroupComparator());
    }

}
