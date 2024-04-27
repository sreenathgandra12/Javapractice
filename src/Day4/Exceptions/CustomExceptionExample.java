package Day4.Exceptions;

class CustomException extends Exception {
    private String message = null;
    public CustomException() {
        super();
    }
    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

// Using the custom exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Trigger the exception
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            // Handle the exception
            System.out.println(e);
        }
    }
}
