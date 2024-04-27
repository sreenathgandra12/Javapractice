package Day4.UncheckedExceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Length of the string: " + str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " + e.getMessage());
        }
    }
}
