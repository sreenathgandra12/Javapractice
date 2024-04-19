package Day1;

public class Sum {
    public static void main(String[] args) {
        int N=10;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);
    }
}
