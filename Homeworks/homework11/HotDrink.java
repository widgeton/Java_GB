public class HotDrink extends Product{
    private  double temperature;
    private  double volume;

    public HotDrink(String name, double price, double volume, double temperature) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
