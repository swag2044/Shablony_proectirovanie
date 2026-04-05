public class Employee extends OrganizationComponent {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Сотрудник: " + name +
                " (" + position + "), зарплата: " + salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    public String getName() {
        return name;
    }
}