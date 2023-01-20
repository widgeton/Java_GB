package terminal.executable.formers;

import data.user.User;

import java.util.List;

public class NoneUserFormer extends UserFormer{
    public NoneUserFormer(List<String> commands) {
        super(commands);
    }

    @Override
    public User createUser() {
        return null;
    }
}
