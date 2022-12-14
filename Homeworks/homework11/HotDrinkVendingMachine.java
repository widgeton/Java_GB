import java.util.List;

public class HotDrinkVendingMachine {
    private List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public void getProduct(String name) {
        for (HotDrink hotDrink : this.hotDrinks) {
            if(hotDrink.getName().equals(name)){
                this.hotDrinks.remove(hotDrink);
                System.out.println("Напиток получен");
                return;
            }
        }
        System.out.println("Напитка с таким именем нет в автомате");
    }

    public void getProduct(String name, double volume, double temperature){
        for (HotDrink hotDrink : this.hotDrinks) {
            if(hotDrink.getName().equals(name) &&
                    hotDrink.getVolume() == volume &&
                    hotDrink.getTemperature() == temperature){
                this.hotDrinks.remove(hotDrink);
                System.out.printf("Напиток %s с объемом %.2f и температурой %.2f получен\n", name, volume, temperature);
                return;
            }
        }
        System.out.println("Напитка с такими параметрами нет в автомате");
    }

}
