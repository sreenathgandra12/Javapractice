package Test;

public class StaticBlock {
        // Static variable to be initialized
        static int x;

        // Static block to initialize the static variable
        static {
            // Perform some initialization
            x = 10;

            // Additional initialization tasks can be performed here
            System.out.println("Static block initialized.");
        }

        public static void main(String[] args) {
            // Access the initialized static variable
            System.out.println("Value of x: " + x);
        }

}
