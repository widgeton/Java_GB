package view;

import data.User;

import java.util.List;

public abstract class UserView {
    public void showTheBest(List<User> userList) {
        User user = findTheBest(userList);
        System.out.println(user);
    }

    protected abstract User findTheBest(List<User> userList);
}
