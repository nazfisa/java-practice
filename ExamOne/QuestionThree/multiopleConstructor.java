package ExamOne.QuestionThree;

public class multiopleConstructor {
    private int firstVariable, secondVariable, thirdVariable;


    multiopleConstructor(int thirdVariable) {
        this.thirdVariable = thirdVariable;
    }

    multiopleConstructor(int firstVariable, int secondVariable, int thirdVariable) {
        this(thirdVariable);
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public void printVariable() {
        System.out.println("First Number: " + firstVariable);
        System.out.println("Second Number: " + secondVariable);
        System.out.println("Third Number: " + thirdVariable);
    }
}
