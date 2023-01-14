package data.user;

public class Student extends User implements Comparable<Student> {
    private int groupNumber;

    public Student(String fio){
        super(fio, null, null);
    }

    public Student(String fio, int yearOfBirth, String passportNumber, int groupNumber) {
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
}
