package ExamOne.QuestionThree;

public class StaticVaraible {
    static int firstNo, SecondNo;

    public static void print(int noOne, int noTwo) {
        firstNo = noOne;
        SecondNo = noTwo;
        System.out.println("First No: " + firstNo);
        System.out.println("Second No: " + SecondNo);
    }
}
