package ExamOne.QuestionTwo;

public class patternPrint {
    public static void main(String[] args) {
        int controlJ = 2, controli;
        for (int i = 1; i <= 5; i++) {
            controli = i;
            if (controli == 3) {
                System.out.print("*");
            } else if (controli > 3) {
                controli = i - controlJ;
                controlJ += 2;
            }

            for (int j = 1; j <= controli; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
