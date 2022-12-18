package service;

import data.User;

import java.util.List;

public interface DataService {
    void write(User user);
    List<User> read(String path);
}
