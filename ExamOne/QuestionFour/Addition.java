package ExamOne.QuestionFour;

public class Addition extends Calculator {
    Addition(double firstNo, double scondNo) {
        super(firstNo, scondNo);
    }

    @Override
    double calculation(double firstNo, double secondNo) {
        return firstNo + secondNo;
    }
}
