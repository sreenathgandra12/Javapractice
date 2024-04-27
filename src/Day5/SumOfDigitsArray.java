package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfDigitsArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(array);
        int listSum = sumList(list);
        int digitSum = sumDigits(listSum);

        System.out.println(listSum);
        System.out.println(digitSum);
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
