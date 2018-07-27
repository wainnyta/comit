public class Employee {

    protected String title;
    protected String name;
    protected double hours;
    protected double baseSalary;

    public Employee(String name, double hours, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.hours = hours;
        this.title = "Employee";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return hours * baseSalary;
    }

    public String toString() {
        return name + " - " + title + "\nHours worked: "  + hours + "\nBase Salary: $" + baseSalary
                + "\nTotal Salary: $" + calculateSalary();
    }
}
