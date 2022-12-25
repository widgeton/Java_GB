package controller.group;

import data.group.Group;
import data.user.User;

public interface UserGroupController<E extends Group, I extends User> extends GroupController<E> {
    void remove(I user, E group);

    void sortByFio(E group);

}
