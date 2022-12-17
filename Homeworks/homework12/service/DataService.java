package service;

import data.User;

public interface DataService {
    void write(User user);
    User read(User user);
}
