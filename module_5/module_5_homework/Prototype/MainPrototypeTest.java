

public class MainPrototypeTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Mouse", 50);

        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = order1.clone();

        System.out.println("Order1: " + order1.getProducts());
        System.out.println("Order2: " + order2.getProducts());
        System.out.println(order1 == order2); // false
        System.out.println(order1.getProducts() == order2.getProducts()); // false
    }
}
