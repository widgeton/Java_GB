package data.user;

public abstract class User {
    protected final String fio;
    protected final Integer yearOfBirth;
    protected final Integer passportNumber;

    protected User(String fio, Integer yearOfBirth, Integer passportNumber) {
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

    public int getPassportNumber() {
        return passportNumber;
    }

    @Override
    public abstract String toString();
}
