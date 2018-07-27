public class Manager extends Employee {


    public Manager(String name, double hours, double baseSalary) {
        super(name, hours, baseSalary);
        this.title = "Manager";
    }

    @Override
    public double calculateSalary() {
        return 1.02 * super.calculateSalary();
    }
}
