package codechef;

/*
https://www.codechef.com/problems/CO92JUDG
 */
import java.util.Scanner;

public class ChefJudges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();


            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }


            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }


            int sumA = sum(A);
            int sumB = sum(B);


            int minSumA = Integer.MAX_VALUE;
            int minSumB = Integer.MAX_VALUE;


            for (int i = 0; i < N; i++) {

                int sumAWithoutI = sumA - A[i];

                minSumA = Math.min(minSumA, sumAWithoutI);


                int sumBWithoutI = sumB - B[i];

                minSumB = Math.min(minSumB, sumBWithoutI);
            }


            if (minSumA < minSumB) {
                System.out.println("Alice");
            } else if (minSumB < minSumA) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        }
        scanner.close();
    }


    private static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;

    }
}
