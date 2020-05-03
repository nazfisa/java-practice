package ExamOne.QuestionThree;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Multiple constructor call
        int firstNo, secondNo, thirdNo;

        System.out.print("Take first No for Multiple constructor: ");
        firstNo = scanner.nextInt();
        System.out.print("Take second No for Multiple constructor: ");
        secondNo = scanner.nextInt();
        System.out.print("Take third No for Multiple constructor: ");
        thirdNo = scanner.nextInt();
        multiopleConstructor multiopleConstructors = new multiopleConstructor(firstNo, secondNo, thirdNo);
        multiopleConstructors.printVariable();

        // No Static class
        NoStaticClass noStaticClass = new NoStaticClass();
        int FNo, SNo;
        System.out.print("Take first No for no Static variable: ");
        FNo = scanner.nextInt();
        System.out.print("Take second No for no Static variable: ");
        SNo = scanner.nextInt();
        noStaticClass.setFristNo(FNo);
        noStaticClass.setSecondNo(SNo);
        System.out.println("Print First NO for no Static variable: " + noStaticClass.getFristNo());
        System.out.println("Print Second NO for no Static variable: " + noStaticClass.getSecondNo());

        //Static variable test
        int noOne, noTwo;
        System.out.print("Take first No for Static variable: ");
        noOne = scanner.nextInt();
        System.out.print("Take second No Static variable: ");
        noTwo = scanner.nextInt();
        StaticVaraible staticVaraible = new StaticVaraible();
        staticVaraible.print(noOne, noTwo);

    }
}
