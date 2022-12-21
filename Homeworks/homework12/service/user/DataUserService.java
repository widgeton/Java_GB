package service.user;

import data.user.User;

import java.util.List;

public interface DataUserService {
    void write(User user);
    List<User> read(String path);
}
