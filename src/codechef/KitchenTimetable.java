package codechef;

import java.util.Scanner;
/*
https://www.codechef.com/problems/KTTABLE?tab=ide
 */

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] endTime = new int[N];
            int[] cookTime = new int[N];
            for (int i = 0; i < N; i++) {
                endTime[i] = scanner.nextInt();
            }
            for (int i = 0; i < N; i++) {
                cookTime[i] = scanner.nextInt();
            }
            int studentsCanCook = calculateStudents(N, endTime, cookTime);
            System.out.println(studentsCanCook);
        }
        scanner.close();
    }
    private static int calculateStudents(int N, int[] endTime, int[] cookTime) {
        int studentsCanCook = 0;
        int prevEndTime = 0;


        for (int i = 0; i < N; i++) {

            int timeAvailable = endTime[i] - prevEndTime;

            if (cookTime[i] <= timeAvailable) {
                studentsCanCook++;
            }

            prevEndTime = endTime[i];
        }

        return studentsCanCook;
    }
}