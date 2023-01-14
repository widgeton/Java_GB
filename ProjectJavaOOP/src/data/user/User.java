package data.user;

public abstract class User {
    private String fio;
    private int yearOfBirth;
    private String passportNumber;

    public User(String fio, Integer yearOfBirth, String passportNumber) {
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
