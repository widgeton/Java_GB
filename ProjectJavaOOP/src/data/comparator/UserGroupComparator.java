package data.comparator;

import data.group.UserGroup;

import java.util.Comparator;

public class UserGroupComparator implements Comparator<UserGroup> {

    @Override
    public int compare(UserGroup o1, UserGroup o2) {
        return Integer.compare(o1.getUsers().size(), o2.getUsers().size());
    }
}
