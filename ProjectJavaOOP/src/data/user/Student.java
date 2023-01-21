package data.user;

public class Student extends User implements Comparable<Student> {
    private final Integer groupNumber;

    public Student(String fio, Integer yearOfBirth, Integer passportNumber, Integer groupNumber) {
        super(fio, yearOfBirth, passportNumber);
        this.groupNumber = groupNumber;
    }


    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public int compareTo(Student student) {
        if (student.getYearOfBirth() < this.getYearOfBirth()) return 1;
        if (student.getYearOfBirth() > this.getYearOfBirth()) return -1;
        return 0;
    }

    @Override
    public String toString()  {
        return String.format("Student %s", fio);
    }
}
