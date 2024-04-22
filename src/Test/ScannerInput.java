package Test;

import java.util.Scanner;

public class ScannerInput {
        public static void main(String[] args) {
            System.out.println("what is your name?");
            Scanner sc=new Scanner(System.in);
            String Name = sc.next();
            System.out.println(Name + " is a good Name to be!");
        }
}

