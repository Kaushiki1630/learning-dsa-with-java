package OOPS.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        shapes.area();
        circle.area();
        square.area();
}
}
