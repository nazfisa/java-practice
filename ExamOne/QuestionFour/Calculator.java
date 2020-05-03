package ExamOne.QuestionFour;

public abstract class Calculator {
    double firstNO, secondNO;

    Calculator(double firstNO, double secondNO) {
        this.firstNO = firstNO;
        this.secondNO = secondNO;
    }

    abstract double calculation(double firstNO, double secondNO);

}
