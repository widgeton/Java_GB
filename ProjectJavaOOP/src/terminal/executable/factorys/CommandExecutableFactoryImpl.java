package terminal.executable.factorys;

import data.user.User;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.Command;
import terminal.executable.executables.*;
import terminal.executable.formers.UserFormer;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    private UserFormerFactory userFormerFactory;
    private CommandsFactory commandsFactory;

    public CommandExecutableFactoryImpl(UserFormerFactory userFormerFactory, CommandsFactory commandsFactory) {
        this.userFormerFactory = userFormerFactory;
        this.commandsFactory = commandsFactory;
    }

    @Override
    public CommandExecutable create(Command command) {
        UserFormer userFormer = userFormerFactory.createUserFormer(command);
        User user = userFormer.createUser();

        if (user != null) {
           CommandUserExecutableFactory commandUserExecutableFactory = commandsFactory.createCommandFactory(command);
           return commandUserExecutableFactory.createCommandExecutable(user);
        } else return new NoneCommandExecutable();
    }
}
