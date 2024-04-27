package Day4.Exceptions;

public class TestTry {

        public static void main(String[] args) {
            try {
                doThingA();
            } catch (SomeException panic) {
                System.out.println("doThingA failed");
            }

            try {
                doThingB();
            } catch (SomeException panic) {
                System.out.println("doThingB failed");
            }
        }

        public static void doThingA() throws SomeException {
            // Code for doing Thing A
            // If an exception occurs, throw SomeException
            throw new SomeException("doThingA failed");
        }

        public static void doThingB() throws SomeException {
            // Code for doing Thing B
            // If an exception occurs, throw SomeException
            throw new SomeException("doThingB failed");
        }
    }

    // Define SomeException class
    class SomeException extends Exception {
        public SomeException(String message) {
            super(message);
        }
}
