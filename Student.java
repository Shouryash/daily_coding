public class Student {
    private int student_id;
    private String student_name;
    private double[] grades; // Assuming an array to store grades

    // Constructor (optional)
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new double[0]; // Initialize an empty array for grades
    }

    // Getter for student_id
    public int getStudentId() {
        return student_id;
    }

    // Setter for student_id
    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    // Getter for student_name
    public String getStudentName() {
        return student_name;
    }

    // Setter for student_name
    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    // Method to add a grade
    public void addGrade(double grade) {
        // Validate grade (assuming it should be between 0 and 100)
        if (grade >= 0 && grade <= 100) {
            // Resize the grades array and add the new grade
            double[] newGrades = new double[grades.length + 1];
            System.arraycopy(grades, 0, newGrades, 0, grades.length);
            newGrades[grades.length] = grade;
            grades = newGrades;
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade. Please provide a grade between 0 and 100.");
        }
    }

    // Display all grades
    public void displayGrades() {
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a student
        Student student = new Student(12345, "Alice Johnson");

        // Set student_id and student_name
        student.setStudentId(54321);
        student.setStudentName("Bob Smith");

        // Add grades
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(78);

        // Display student info and grades
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        student.displayGrades();
    }
}
