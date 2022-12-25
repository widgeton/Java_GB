package controller.user;

import data.user.User;

import java.util.List;

public interface UserController<E extends User> {
    void write(E user);

    List<E> read(String path);

    void save(E entity);

    E findById(int id);

    E findByFio(String fio);
}
