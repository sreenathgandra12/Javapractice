package Day3;


import java.util.*;
import java.lang.*;

public class Wordle {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            sc.nextLine();
            while(t-->0)
            {
                String s1=sc.next();
                String s2=sc.next();
                char[] ch = s1.toCharArray();
                char[] ch2 = s2.toCharArray();


            StringBuilder M = new StringBuilder();
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(j)) {
                    M.append("G");
                } else {
                    M.append("B");
                }
            }
                System.out.println(M);

            }
        }
}


