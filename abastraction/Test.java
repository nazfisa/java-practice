package abastraction;

public class Test {
    public static void main(String[] args) {
        Shape shape;
        shape= new Ractangel(30.0,20.5);
        shape.area();
        shape= new Triangle(30.0,20.5);
        shape.area();
        shape= new Circle(30.0);
        shape.area();
    }
}
