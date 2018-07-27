public class Supervisor extends Manager {

    private static final int MAXIMUM_HOURS = 5;
    public Supervisor(String name, double hours, double baseSalary) {
        super(name, hours, baseSalary);
        this.title = "Supervisor";
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        if (hours > MAXIMUM_HOURS) {
            salary += (hours - MAXIMUM_HOURS) * baseSalary;
        }
        return salary;
    }
}
