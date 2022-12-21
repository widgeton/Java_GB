package service.group;

import data.group.Group;
import data.group.GroupStream;
import data.comparator.GroupStreamComparator;

public class GroupStreamService implements DataGroupService{
    @Override
    public void sort(Group groupStreams){
        ((GroupStream)(groupStreams)).getGroups().sort(new GroupStreamComparator());
    }
}
