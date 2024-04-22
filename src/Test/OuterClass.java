package Test;

public class OuterClass {
    static class Student {
        private String name;
        private int studentId;

        // Constructor for Student class
        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        }

        // Getters for Student class
        public String getName() {
            return name;
        }

        public int getStudentId() {
            return studentId;
        }
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObj = new OuterClass();

        // Creating instances of the nested class
        Student student1 = new Student("Alice", 1001);
        Student student2 = new Student("Bob", 1002);

        // Accessing the nested class members
        System.out.println("Student 1: " + student1.getName() + " - ID: " + student1.getStudentId());
        System.out.println("Student 2: " + student2.getName() + " - ID: " + student2.getStudentId());
    }
}
