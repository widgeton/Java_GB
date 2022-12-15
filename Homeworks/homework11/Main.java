import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> hotDrinks = new ArrayList<>();

        hotDrinks.add((new HotDrink("чай", 25.0, 0.25, 70.0)));
        hotDrinks.add((new HotDrink("кофе", 30.5, 0.25, 67.5)));
        hotDrinks.add((new HotDrink("какао", 27.0, 0.25, 65.0)));

        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine(hotDrinks);

        hdvm.getProduct("чай");
        hdvm.getProduct("кофе", 0.25, 67.5);
        hdvm.getProduct("молоко");
    }
}
