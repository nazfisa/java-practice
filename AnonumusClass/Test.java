package AnonumusClass;

public class Test {
    public static void main(String[] args) {
        Person p= new Person(){
            @Override
            public void display() {
                System.out.println("THIS IS TEST CLASS");
            }
        };
        p.display();
    }
}
