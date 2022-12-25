package data.iterator;

import data.group.GroupStream;
import data.group.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private GroupStream groupStream;
    private List<StudentGroup> groups;
    private int cursor;

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.groups = groupStream.getGroups();
    }

    @Override
    public boolean hasNext() {
        return cursor < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(cursor++);
    }

    @Override
    public void remove() {
        groups.remove(cursor);
    }
}
