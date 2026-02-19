public class Weapon implements Cloneable {

    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Weapon clone() {
        return new Weapon(name, damage);
    }

    public String toString() {
        return name + " (Damage: " + damage + ")";
    }
}
