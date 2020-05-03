package polymorphic;

public class Ractangel extends Shape {
    double hieght, width;
    Ractangel(double hieght, double width){
        this.hieght = hieght;
        this.width = width;
    }
    double area(){
        return hieght*width;
    }
}
