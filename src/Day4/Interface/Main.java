package Day4.Interface;

public class Main {
    public static void main(String[] args) {
    Rectangle r=new Rectangle(10,12);
    System.out.println("Area of the Rectangle: " + r.getArea());
    Circle circle = new Circle(3);
    System.out.println("Area of the Circle: " + circle.getArea());
    Square s=new Square(4);
    System.out.println("Area of the Square: " + s.getArea());
    }
}
