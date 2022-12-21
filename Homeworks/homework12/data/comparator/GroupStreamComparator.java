package data.comparator;

import data.group.Group;
import data.group.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return Integer.compare(((GroupStream)(o1)).getGroups().size(), ((GroupStream)(o2)).getGroups().size());
    }
}
