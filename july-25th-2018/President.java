public class President extends Employee {

    public President(String name, double hours, double baseSalary) {
        super(name, hours, baseSalary);
        this.title = "President";
    }

    @Override
    public double calculateSalary() {
        return 1.50 * super.calculateSalary();
    }
}
