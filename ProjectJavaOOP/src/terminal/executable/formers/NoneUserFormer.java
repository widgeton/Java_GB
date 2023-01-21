package terminal.executable.formers;

import data.user.User;

import java.util.ArrayList;
import java.util.List;

public class NoneUserFormer extends UserFormer{
    public NoneUserFormer(ArrayList<String> commands) {
        super(commands);
    }

    @Override
    public User createUser() {
        return null;
    }
}
