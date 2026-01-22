class Student {

    // Private fields (Encapsulation)
    private int id;
    private String name;
    private int marks;

    // Constructor using this keyword
    Student(int id, String name, int marks) {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Setters
    public void setId(int id) {
        this.id=id;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setMarks(int marks) {
        this.marks=marks;
    }

    // Method to check pass/fail
    public boolean isPassed() {
        return marks>=40;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + (isPassed() ? "Yes" : "No"));
        System.out.println();
    }
}

public class Problem4 {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student(1, "Amogh", 96);
        Student s2 = new Student(2, "Rohit", 35);
        s1.displayResult();
        s2.displayResult();
    }
}
