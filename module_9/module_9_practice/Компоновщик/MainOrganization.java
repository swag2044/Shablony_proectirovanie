public class MainOrganization {
    public static void main(String[] args) {

        Employee e1 = new Employee("Али", "Разработчик", 5000);
        Employee e2 = new Employee("Айжан", "Дизайнер", 4000);
        Contractor c1 = new Contractor("Тимур", 2000);

        Department devDept = new Department("Разработка");
        Department designDept = new Department("Дизайн");
        Department company = new Department("Компания");

        devDept.add(e1);
        devDept.add(c1);

        designDept.add(e2);

        company.add(devDept);
        company.add(designDept);

        company.display("");

        System.out.println("\n Бюджет: " + company.getSalary());
        System.out.println("Сотрудников: " + company.getEmployeeCount());

        System.out.println("\n Поиск:");
        company.findEmployee("Али");

        
        e1.setSalary(6000);

        System.out.println("\n Новый бюджет: " + company.getSalary());
    }
}