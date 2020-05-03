package inheritanceTest;

public class mainClass {
    public static void main(String[] args) {
        subClassA A= new subClassA();
        subClassB B= new subClassB();
        A.setSalary(10);
        System.out.println(B.getSalary());
    }
}
