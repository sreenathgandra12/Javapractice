package Day4.CheckedExceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
