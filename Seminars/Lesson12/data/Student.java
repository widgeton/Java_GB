package data;

public class Student extends User{
    private String numGrup;

    public Student(String fio, String bYear, String nPass, String numGrup) {
        super(fio, bYear, nPass);
        this.numGrup = numGrup;
    }
}
