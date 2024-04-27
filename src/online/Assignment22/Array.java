package online.Assignment22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }
            ArrayList<Integer> result = sumOfArrays(A, B);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static ArrayList<Integer> sumOfArrays(int[] A, int[] B) {
        int i = A.length - 1;
        int j = B.length - 1;
        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += A[i--];
            }
            if (j >= 0) {
                sum += B[j--];
            }
            result.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(result);
        return result;
    }
}
