package data;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>, Comparable<GroupStream> {
    private List<StudentGroup> groups;
    private int numberOfGroups;

    public GroupStream(List<StudentGroup> groups) {
        this.groups = groups;
        this.numberOfGroups = groups.size();
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }

    @Override
    public int compareTo(GroupStream o) {
        return Integer.compare(this.numberOfGroups, o.numberOfGroups);
    }
}
