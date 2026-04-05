public abstract class OrganizationComponent {

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void display(String indent);
    public abstract double getSalary();
    public abstract int getEmployeeCount();
}