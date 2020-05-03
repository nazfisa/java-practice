package ExamOne.QuestionFour;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNo, secondNo;
        String operator;
        System.out.print("Input first number: ");
        firstNo = scanner.nextInt();

        System.out.print("Input Operator: ");
        operator = scanner.next();

        System.out.print("Input second number: ");
        secondNo = scanner.nextInt();

        Calculator calculator;

        switch (operator) {
            case "+":
                calculator = new Addition(firstNo, secondNo);
                System.out.println("Result: " +calculator.calculation(firstNo, secondNo));
                break;

            case "-":
                calculator = new Substraction(firstNo, secondNo);
                System.out.println("Result: " +calculator.calculation(firstNo, secondNo));
                break;

            case "*":
                calculator = new Multiplication(firstNo, secondNo);
                System.out.println("Result: " + calculator.calculation(firstNo, secondNo));
                break;

            default:
                System.out.println("Please follow the proper instruction.");
        }


    }
}
