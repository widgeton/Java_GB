package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.util.List;

public class TeacherService implements DataService{
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public List<User> read(String path) {
        return ReaderFromTxt.read(path);
    }
}
