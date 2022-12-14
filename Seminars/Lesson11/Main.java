import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VendingMachine> vm = new ArrayList<>();
        vm.add(new VendingMachine());
        vm.add(new DrinksVendingMachine());

        for (VendingMachine i: vm) {
            i.restore();
        }
    }
}
