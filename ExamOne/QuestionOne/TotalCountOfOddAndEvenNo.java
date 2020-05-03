package ExamOne.QuestionOne;

import java.util.Scanner;

public class TotalCountOfOddAndEvenNo {
    public static void main(String[] args) {
        int startingNo, endingNo, index, AmountOfEvenNO = 0, AmountOfOddNO = 0, evenNoindex = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Starting number: ");
        startingNo = scanner.nextInt();

        System.out.print("Enter Ending number: ");
        endingNo = scanner.nextInt();

        index = (endingNo - startingNo) / 2;
        int[] evenNumbers = new int[index + 10]; //+10 for extra security.

        if (startingNo < 0 || endingNo < 0) {
            System.out.println("Number Must be positive");
        } else if (startingNo > endingNo) {
            System.out.println("Start;ing Number must be greater then ending number");
        } else {

            for (int i = startingNo; i <= endingNo; i++) {
                if (i % 2 == 0) {
                    AmountOfEvenNO++;
                    evenNumbers[evenNoindex] = i;
                    evenNoindex++;
                } else {
                    AmountOfOddNO++;
                }
            }
        }
        System.out.println("Total even number count: " + AmountOfEvenNO);
        System.out.println("Total odd number count: " + AmountOfOddNO);
        System.out.print("The even numbers between " + startingNo + " and " + endingNo + " are: ");
        for (int i = 0; i < evenNoindex-1; i++) {
            System.out.print(evenNumbers[i] + ", ");
        }
        System.out.print(evenNumbers[evenNoindex-1]);

    }
}
