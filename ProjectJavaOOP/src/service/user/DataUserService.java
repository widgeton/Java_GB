package service.user;

import data.user.User;

import java.util.List;

public interface DataUserService<E extends User> {
    void write(E user);

    List<E> read(String path);
    void saveUser(E user);
    void deleteUser(E user);
}
