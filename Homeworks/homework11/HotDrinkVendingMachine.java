import java.util.List;
import java.util.stream.Collectors;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
        super(hotDrinks.stream().map(i ->(Product)(i)).collect(Collectors.toList())); // преобразование в List<Product>
    }

    public void getProduct(String name, double volume, double temperature){
        for (Product hotDrink : this.products) {
            if(hotDrink.getName().equals(name) &&
                    ((HotDrink)(hotDrink)).getVolume() == volume &&
                    ((HotDrink)(hotDrink)).getTemperature() == temperature){
                this.products.remove(hotDrink);
                System.out.printf("Напиток %s с объемом %.2f и температурой %.2f получен\n", name, volume, temperature);
                return;
            }
        }
        System.out.println("Напитка с такими параметрами нет в автомате");
    }

}
