package terminal.executable.factorys;

import data.user.User;
import terminal.Command;

public class CommandsFactory {
    public CommandUserExecutableFactory createCommandFactory(Command command){
        if(command.isAddCommand()){
            return new CreateUserExecutableFactory();
        } else if (command.isDeleteCommand()){
            return new DeleteUserExecutableFactory();
        } else return new NoneCommandUserExecutableFactory();
    }
}
