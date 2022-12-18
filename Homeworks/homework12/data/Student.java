package data;

public class Student extends User{
    private int groupNumber;

    public Student(String fio, int yearOfBirth, String passportNumber, int groupNumber) {
        super(fio, yearOfBirth, passportNumber);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
