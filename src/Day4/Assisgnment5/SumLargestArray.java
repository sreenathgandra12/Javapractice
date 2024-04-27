package Day4.Assisgnment5;

import java.util.Scanner;

public class SumLargestArray {
    public static void main(String[] args) {

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println("Sum of the array: " + sum);
        int max = arr[0];
        for (i = 0; i < n; i++) {
            max = arr[i];
        }
        System.out.println("Largest array element:" + max);

    }
}
