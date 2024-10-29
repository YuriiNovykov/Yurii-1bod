// Define the Person interface
public interface Person {
    void getInfo(); // No need for 'public' here
}

// Define the Student class
class Student implements Person {
    private String gender;
    private int age;

    // Constructor
    public Student(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    // Implement the getInfo method
    @Override
    public void getInfo() {
        System.out.println("Student - Gender: " + gender + ", Age: " + age);
    }
}

// Define the Employee class
class Employee implements Person {
    private String gender;
    private int age;

    // Constructor
    public Employee(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    // Calculate years worked since age 20
    public int yearsWorked() {
        return Math.max(0, age - 20);
    }

    // Implement the getInfo method
    @Override
    public void getInfo() {
        System.out.println("Employee - Gender: " + gender + ", Age: " + age + ", Years Worked: " + yearsWorked());
    }
}

// Main class to test the implementation

}