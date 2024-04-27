package online.Assignment23;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        List<Integer> list = Arrays.asList(array);
        int listSum = sumList(list);
        int digitSum = sumDigits(listSum);
       // System.out.println("Sum of the elements in the array: " + listSum);
        System.out.println("Sum of the digits of the sum: " + digitSum);
    }
    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

