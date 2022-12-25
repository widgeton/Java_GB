package data.group;

import data.iterator.UserGroupIterator;
import data.user.User;

import java.util.Iterator;
import java.util.List;

public abstract class UserGroup implements Group, Iterable<User> {

    private final List<User> users;

    public UserGroup(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public Iterator<User> iterator() {
        return new UserGroupIterator(this);
    }
}
