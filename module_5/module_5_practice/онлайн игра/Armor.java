public class Armor implements Cloneable {

    private String name;
    private int defense;

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public Armor clone() {
        return new Armor(name, defense);
    }

    public String toString() {
        return name + " (Defense: " + defense + ")";
    }
}
