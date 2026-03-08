import java.util.Scanner;

public abstract class Beverage {

    public final void prepareRecipe() {

        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Кипятим воду");
    }

    void pourInCup() {
        System.out.println("Наливаем в чашку");
    }

    abstract void brew();
    abstract void addCondiments();

    boolean customerWantsCondiments() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Добавить добавки? yes/no");

        String answer = sc.nextLine();

        return answer.equalsIgnoreCase("yes");
    }
}