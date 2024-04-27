package Assignment.Assignment6;

public class StringStartsWith {
    public static void main(String[] args) {
        String str1 = "Fortuner is my Fav car in Tata";
        String str2 = "Harrier is also my Fav car";
        String startStr = "Fortuner";
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);
        System.out.println(str1 + " starts with " +
                startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
                startStr + "? " + starts2);
    }
}
