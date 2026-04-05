import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {

    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Отдел: " + name);

        for (OrganizationComponent c : components) {
            c.display(indent + "   ");
        }
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent c : components) {
            total += c.getSalary();
        }
        return total;
    }

    @Override
    public int getEmployeeCount() {
        int count = 0;
        for (OrganizationComponent c : components) {
            count += c.getEmployeeCount();
        }
        return count;
    }

    // 🔍 поиск сотрудника
    public void findEmployee(String name) {
        for (OrganizationComponent c : components) {
            if (c instanceof Employee) {
                Employee e = (Employee) c;
                if (e.getName().equalsIgnoreCase(name)) {
                    e.display("");
                }
            }
            if (c instanceof Department) {
                ((Department) c).findEmployee(name);
            }
        }
    }
}