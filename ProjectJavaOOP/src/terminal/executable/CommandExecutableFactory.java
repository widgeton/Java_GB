package terminal.executable;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;

public class CommandExecutableFactory {
    public CommandExecutable create (String[] input){
        if (input[0].equals("/add")){
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), new Student(input[1]));
        } else {
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()), new Student(input[1]));
        }
    }

}
