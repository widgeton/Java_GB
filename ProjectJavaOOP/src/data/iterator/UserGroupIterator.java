package data.iterator;

import data.group.UserGroup;
import data.user.User;

import java.util.Iterator;
import java.util.List;

public class UserGroupIterator implements Iterator<User> {
    private final List<User> users;
    private int cursor;

    public UserGroupIterator(UserGroup userGroup) {
        this.users = userGroup.getUsers();
    }

    @Override
    public boolean hasNext() {
        return cursor < users.size();
    }

    @Override
    public User next() {
        return users.get(cursor++);
    }

    @Override
    public void remove() {
        this.users.remove(cursor);
    }
}
