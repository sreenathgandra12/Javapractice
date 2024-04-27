package Day3.single;

public class Realme extends Mobile {
    public Realme( String mobileName, String model, String colour, String ram) {
        super( mobileName, model, colour, ram);
    }

    public static void main(String[] args) {
        Realme r1=new Realme( "RealmeC20","C20","Black","4GB");
        System.out.println(r1);
    }
}
