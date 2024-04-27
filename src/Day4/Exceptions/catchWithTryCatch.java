package Day4.Exceptions;

public class catchWithTryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            try {
                int[] array = new int[5];
                array[10] = 50;
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e2.getMessage());
            }
        }
    }
}
