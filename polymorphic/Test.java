package polymorphic;

public class Test {
    public static void main(String[] args) {
//        Shape shape= new Shape();
//        shape.area();
//        Triangle T= new Triangle(20.0,5.0);
//        T.area();
//        Ractangel R= new Ractangel(20.0,5.0);
//        R.area();
        Shape [] S= new Shape[3];
        S[0]= new Shape();
        S[1]= new Triangle(20.0,5.0);

        S[2]= new Ractangel(20.0,5.0);
        System.out.println(S[0].area());
        System.out.println(S[1].area());
        System.out.println(S[2].area());

    }
}
