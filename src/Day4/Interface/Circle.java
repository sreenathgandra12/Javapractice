package Day4.Interface;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        System.out.println("circle");
        return Math.PI*radius*radius;
    }
}
