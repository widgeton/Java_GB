package data;

public class Teacher extends User{
    private String caf;

    public Teacher(String fio, String bYear, String nPass, String caf) {
        super(fio, bYear, nPass);
        this.caf = caf;
    }
}
