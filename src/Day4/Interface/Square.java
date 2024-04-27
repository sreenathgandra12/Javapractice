package Day4.Interface;

public class Square implements Shape{

    private double Side;

    public Square(double side) {
        Side = side;
    }

    @Override
    public double getArea() {
        System.out.println("Square");
        return Side*Side;
    }
}
