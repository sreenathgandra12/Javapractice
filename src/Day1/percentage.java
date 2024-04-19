package Day1;
// Write a program to print the percentage from the marks of 5 subjects.
public class percentage {
    public static void main(String[] args) {
    float marks1=70;
    float marks2=80.5F;
    float marks3=75;
    float marks4=85;
    float marks5=50;

    float totalMarks = 500;
    float totalObtainedMarks = marks1 + marks2 + marks3 + marks4 + marks5;
    float percentage = totalObtainedMarks/totalMarks * 100;
    System.out.println("The percentage of marks of 5 subjects is: " + percentage +  "%");
    }
}

