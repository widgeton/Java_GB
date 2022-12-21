package view;

import data.user.User;

import java.util.List;

public class StudentView extends UserView{
    @Override
    protected User findTheBest(List<User> userList) {
        // логика для студентов
        return null;
    }
}
