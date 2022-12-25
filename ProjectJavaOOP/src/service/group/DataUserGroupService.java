package service.group;


import data.comparator.UserComparator;
import data.group.Group;
import data.group.UserGroup;
import data.user.User;
import repository.GroupRepository;

public abstract class DataUserGroupService extends DataGroupService {


    public DataUserGroupService(GroupRepository repository) {
        super(repository);
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

}
