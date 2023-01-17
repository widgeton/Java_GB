package data.user;

public abstract class User {
    private String fio;
    private int yearOfBirth;
    private int passportNumber;

    public User(String fio, Integer yearOfBirth, Integer passportNumber) {
        this.fio = fio;
        this.yearOfBirth = yearOfBirth;
        this.passportNumber = passportNumber;
    }

    public String getFio() {
        return fio;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
