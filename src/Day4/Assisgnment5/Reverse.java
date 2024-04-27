package Day4.Assisgnment5;

public class Reverse {
        public static void main(String[] args) {
            String input = "Techademy";
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length / 2; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[charArray.length - 1 - i];
                charArray[charArray.length - 1 - i] = temp;
            }
            String reversedString = new String(charArray);
            System.out.println("Reversed string: " + reversedString);
        }

}
