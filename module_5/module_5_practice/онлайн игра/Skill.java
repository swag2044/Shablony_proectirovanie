public class Skill implements Cloneable {

    private String name;
    private int power;

    public Skill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Skill clone() {
        return new Skill(name, power);
    }

    public String toString() {
        return name + " (Power: " + power + ")";
    }
}
