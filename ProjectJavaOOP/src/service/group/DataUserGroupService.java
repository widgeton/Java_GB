package service.group;


import data.comparator.UserComparator;
import data.group.Group;
import data.group.UserGroup;
import data.user.User;
import repository.GroupRepository;

public abstract class DataUserGroupService implements DataGroupService {

    private final GroupRepository groupRepository;

    public DataUserGroupService(GroupRepository repository) {
        this.groupRepository = repository;
    }

    public void removeUser(User student, UserGroup userGroup) {
        while (userGroup.iterator().hasNext()) {
            if (userGroup.iterator().next().equals(student)) {
                userGroup.iterator().remove();
            }
        }
    }

    @Override
    public void sort(Group userGroup) {
        ((UserGroup) (userGroup)).getUsers().sort(new UserComparator());
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
