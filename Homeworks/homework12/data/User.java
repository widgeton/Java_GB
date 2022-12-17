package data;

public abstract class User {
    private String fio;
    private String bYear;
    private String nPass;

    public User(String fio, String bYear, String nPass) {
        this.fio = fio;
        this.bYear = bYear;
        this.nPass = nPass;
    }
}
