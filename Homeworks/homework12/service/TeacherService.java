package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherService implements DataService{
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
