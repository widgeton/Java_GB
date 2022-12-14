import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void getProduct(String name) {
        for (Product product : this.products) {
            if(product.getName().equals(name)){
                this.products.remove(product);
                System.out.println("Продукт получен");
                return;
            }
        }
        System.out.println("Продукта с таким именем нет в автомате");
    }

    public List<Product> getProducts() {
        return products;
    }
}
