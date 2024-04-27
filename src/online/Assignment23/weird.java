package online.Assignment23;

import java.util.Scanner;

public class weird {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            scanner.close();
            if(n%2==0)
            {
                if((n>=2 && n<=5))
                {
                    System.out.println("Not Weird");
                }
                else if(n>=6 && n<=20)
                {
                    System.out.println("Weird");
                }
                else
                {
                    System.out.println("Not Weird");
                }
            }
            else
            {
                System.out.println("Weird");
            }
        }
}

