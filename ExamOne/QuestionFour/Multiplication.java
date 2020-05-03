package ExamOne.QuestionFour;

public class Multiplication extends Calculator {
    Multiplication(double firstNo, double secondNo) {
        super(firstNo, secondNo);
    }

    @Override
    double calculation(double firstNO, double secondNO) {
        return firstNO * secondNO;
    }
}
