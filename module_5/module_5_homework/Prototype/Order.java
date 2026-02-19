

import java.util.ArrayList;
import java.util.List;

public class Order implements Cloneable {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }

    public List<Product> getProducts() { return products; }

    public Order clone() {
        try {
            Order cloned = (Order) super.clone();
            cloned.products = new ArrayList<>();
            for (Product p : this.products) cloned.products.add(p.clone());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
