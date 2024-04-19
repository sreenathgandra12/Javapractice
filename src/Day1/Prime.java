package Day1;
//Write a program to print all prime numbers till n’th number;
public class Prime {
    public static void main(String[] args) {
        int n = 50;
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
