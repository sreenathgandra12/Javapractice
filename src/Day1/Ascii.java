package Day1;

public class Ascii {
    public static void main(String[] args) {
        for (int i = 0; i <= 255; i++) {
            char a= (char)i;
            System.out.println("The ASCII value of " + a + " is: " + i);
        }
    }
}
