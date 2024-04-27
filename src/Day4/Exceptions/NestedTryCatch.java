package Day4.Exceptions;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Inner try block 1
            try {
                System.out.println("Going to divide by 0");
                int b = 39 / 0;
            } catch (ArithmeticException e1) {
                System.out.println("Arithmetic exception: " + e1);
            }
            try {
                int[] a = new int[5];
                a[5] = 4; // Assigning a value out of array bounds
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e2);
            }

            System.out.println("Other statement");
        } catch (Exception e3) {
            System.out.println("Handled the exception (outer catch): " + e3);
        }

        System.out.println("Normal flow..");
    }
}
