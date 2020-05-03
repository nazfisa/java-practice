package polymorphic;

public class Triangle extends Shape {
    double hiegth, width;
    Triangle(double hiegth, double width){
        this.hiegth= hiegth;
        this.width=width;
    }
    double area(){
        return 0.5* hiegth* width;
    }
}
