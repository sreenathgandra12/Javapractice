package Test;

import java.util.Scanner;

public class smallFact {

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Input the integer n
            int n = scanner.nextInt();

            // Calculate factorial of n
            int result = factorial(n);

            // Output the result
            System.out.println(result);
        }

        scanner.close();
    }
}