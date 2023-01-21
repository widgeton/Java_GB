package controller.group;

import data.group.Group;

public interface GroupController<E extends Group> {
    void sort(E group);

    void save(E group);

}
