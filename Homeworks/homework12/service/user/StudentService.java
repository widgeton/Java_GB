package service.user;

import data.user.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.util.List;

public class StudentService implements DataUserService {

    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public List<User> read(String path) {
        return ReaderFromTxt.read(path);
    }
}
