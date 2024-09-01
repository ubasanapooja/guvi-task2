

// Subclass Employee
public class Employee extends Person {
    private String employeeID;
    private double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Initialize Person attributes using super
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "E001", 50000.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Salary: " + employee.getSalary());
    }
}
