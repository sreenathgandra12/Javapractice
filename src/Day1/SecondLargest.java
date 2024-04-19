package Day1;

import java.util.Scanner;

public class SecondLargest {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            System.out.println("Enter 5 integers:");
            for (int i = 0; i < 5; i++) {

                System.out.print("Enter integer " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
            System.out.println("The second largest number is: " + secondLargest);
            scanner.close();
    }

}
