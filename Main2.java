class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonuses
    public double calculateBonus() {
        // Default bonus calculation
        return salary * 0.10; // 10% bonus
    }

    // Method to generate performance reports
    public String generatePerformanceReport() {
        // Simple performance report
        return name + " has performed satisfactorily.";
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Managers may have a higher bonus percentage
    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }

    // Method for managing projects
    public String manageProjects() {
        // Project management details
        return "Managing company projects efficiently.";
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Developers may have project-specific performance reports
    @Override
    public String generatePerformanceReport() {
        return name + " has delivered all projects on time with excellent quality.";
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Programmers may have additional methods specific to coding tasks
    public String codeReview() {
        // Code review details
        return "Conducting thorough code reviews.";
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Main St", 90000, "Project Manager");
        Developer developer = new Developer("Bob", "456 Maple Dr", 80000, "Senior Developer");
        Programmer programmer = new Programmer("Charlie", "789 Oak Ln", 70000, "Junior Programmer");

        // Example usage of methods
        System.out.println(manager.name + " Bonus: " + manager.calculateBonus());
        System.out.println(developer.name + " Performance: " + developer.generatePerformanceReport());
        System.out.println(programmer.name + " Review: " + programmer.codeReview());
    }
}
