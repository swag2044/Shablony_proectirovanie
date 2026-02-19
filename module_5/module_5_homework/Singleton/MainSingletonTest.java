

public class MainSingletonTest {
    public static void main(String[] args) {
        ConfigurationManager cfg1 = ConfigurationManager.getInstance();
        ConfigurationManager cfg2 = ConfigurationManager.getInstance();

        cfg1.setSetting("theme", "dark");
        System.out.println(cfg2.getSetting("theme")); // dark

        System.out.println(cfg1 == cfg2); // true — один экземпляр
    }
}
