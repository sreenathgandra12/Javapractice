package Day1;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("The second smallest number is: " + secondSmallest);
        scanner.close();
    }

}
