package service.group;

import data.group.Group;

public interface DataGroupService {
    void sort(Group group);

    void save(Group group);

    Group findById(int id);
}
