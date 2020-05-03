package ExamOne.QuestionFour;

public class Substraction extends Calculator {
    Substraction(double firstNo, double secondNo) {
        super(firstNo, secondNo);
    }

    @Override
    double calculation(double firstNO, double secondNO) {
        return firstNO - secondNO;
    }
}
