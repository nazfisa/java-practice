package abastraction;

public class Ractangel extends Shape {
    Ractangel(double dim1, double dim2){
        super(dim1,dim2);
    }

    @Override
    void area() {
        double result = dim1* dim2;
        System.out.println("The Ractangle is "+ result);
    }
}
