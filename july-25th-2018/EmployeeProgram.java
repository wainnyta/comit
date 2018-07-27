public class EmployeeProgram {

    public static void main(String[] args) {
        Employee employee = new Employee("Wainny", 10.0, 50.00);
        System.out.println(employee);

        President president = new President("Pablo", 10.0, 50.0);
        System.out.println("\n" + president);

        Manager manager = new Manager("Princi", 10.0, 50.0);
        System.out.println("\n" + manager);

        Supervisor supervisor = new Supervisor("Anteneh", 10.0, 50.0);
        System.out.println("\n" + supervisor);
    }
}
