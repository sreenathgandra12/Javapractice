package codechef;

import java.util.Scanner;
/*
https://www.codechef.com/problems/FOODCOST?tab=statement
 */

public class Foodcosts {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        for(int i=0;i<=6;i++)
        {
            temp=a*i;
        }

        int result=temp+b;
        System.out.println(result);
    }
}
