package Day4.UncheckedExceptions;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println("Element at index 3: " + arr[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}
