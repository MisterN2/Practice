abstract class Shape {

    public abstract double area();
}


class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;

    }



    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public double area() {
        return width * height;
    }
}


class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }




    @Override
    public double area() {
        return side * side;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(3.0,5.0);
        Shape square = new Square(4.5);
        System.out.println("Circle area " + circle.area());
        System.out.println("Rectangle area " + rectangle.area());
        System.out.println("Square area " + square.area());

    }
}
