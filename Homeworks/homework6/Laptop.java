import java.util.Objects;

public class Laptop {
    private String serialCode;
    private String brand;
    private String mark;
    private String color;
    private String orm;
    private String valueHardDisk;
    private String os;

    public Laptop(String serialCode, String brand, String mark) {
        this.serialCode = serialCode;
        this.brand = brand;
        this.mark = mark;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public String getBrand() {
        return brand;
    }

    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

    public String getOrm() {
        return orm;
    }

    public String getValueHardDisk() {
        return valueHardDisk;
    }

    public String getOs() {
        return os;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOrm(String  orm) {
        this.orm = orm;
    }

    public void setValueHardDisk(String valueHardDisk) {
        this.valueHardDisk = valueHardDisk;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return brand + " " + mark;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Laptop && Objects.equals(this.serialCode, ((Laptop) obj).serialCode);
    }
}
