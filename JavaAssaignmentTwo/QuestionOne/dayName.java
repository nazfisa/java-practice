package JavaAssaignmentTwo.QuestionOne;

import java.util.Scanner;

public class dayName {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int dayNo;
        dayNo=scanner.nextInt();
        if(dayNo>=1 && dayNo<=31){
            switch (dayNo%7){
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
            }
        }
        else{
            System.out.println("Sorry! you submit wrong Day number!");
        }

    }
}
