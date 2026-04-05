public class Contractor extends OrganizationComponent {

    private String name;
    private double payment;

    public Contractor(String name, double payment) {
        this.name = name;
        this.payment = payment;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Контрактор: " + name +
                " (оплата: " + payment + ")");
    }

    @Override
    public double getSalary() {
        return 0; 
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }
}