// Base class Employee
class Employee {
    // Method to simulate work
    public void work() {
        System.out.println("Employee is working.");
    }

    // Method to get the salary
    public double getSalary() {
        return 50000.0; // Example salary value
    }
}

// Subclass HRManager
class HRManager extends Employee {
    // Override the work method
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    // New method to add an employee
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        // Instantiate an Employee object
        Employee employee = new Employee();
        employee.work();
        System.out.println("Employee Salary: " + employee.getSalary());

        // Instantiate an HRManager object
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
    }
}
