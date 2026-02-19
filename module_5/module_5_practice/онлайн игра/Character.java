import java.util.ArrayList;
import java.util.List;

public class Character implements Cloneable {

    private int health;
    private int strength;
    private int agility;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;
    private List<Skill> skills = new ArrayList<>();

    public Character(int health, int strength, int agility, int intelligence,
                     Weapon weapon, Armor armor) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public Character clone() {
        Character cloned = new Character(
                health, strength, agility, intelligence,
                weapon.clone(), armor.clone());

        for (Skill skill : skills) {
            cloned.addSkill(skill.clone());
        }

        return cloned;
    }

    public void show() {
        System.out.println("Health: " + health);
        System.out.println("Weapon: " + weapon);
        System.out.println("Armor: " + armor);
        System.out.println("Skills: " + skills);
        System.out.println("---------------------");
    }
}
