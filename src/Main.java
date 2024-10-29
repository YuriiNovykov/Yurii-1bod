public class Main {
    public static void main(String[] args) {
        // Create Student and Employee instances
        Student student = new Student("Female", 18);
        Employee employee = new Employee("Male", 30);

        // Print information
        student.getInfo();
        employee.getInfo();
    }