package data;

public abstract class User {
    private String fio;
    private int yearOfBirth;
    private String passportNumber;

    public User(String fio, int yearOfBirth, String passportNumber) {
        this.fio = fio;
        this.yearOfBirth = yearOfBirth;
        this.passportNumber = passportNumber;
    }
}
