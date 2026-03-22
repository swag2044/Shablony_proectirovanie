public class CafeTest {
    public static void main(String[] args) {
        Beverage drink = new Espresso();

        drink = new Milk(drink);
        drink = new Sugar(drink);
        drink = new WhippedCream(drink);

        System.out.println(drink.getDescription());
        System.out.println("Total cost: $" + drink.cost());

        
        Beverage drink2 = new Latte();
        drink2 = new Caramel(drink2);
        drink2 = new Milk(drink2);

        System.out.println("\n" + drink2.getDescription());
        System.out.println("Total cost: $" + drink2.cost());
    }
}