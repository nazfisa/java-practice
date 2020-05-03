package JavaAssaignmentTwo.QuestionTwo;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SalaryManagement salaryManagement = new SalaryManagement();
        GradeOne gradeOne = new GradeOne();
        GradeTwo gradeTwo = new GradeTwo();
        GradeThree gradeThree = new GradeThree();
        GradeFour gradeFour = new GradeFour();
        GradeFive gradeFive = new GradeFive();
        GradeSix gradeSix = new GradeSix();
        System.out.println("Number of Input:");

        System.out.print("Press 1 for employee details." +
                "\nPress 2 for basic salary imputation" +
                "\nPress 3 for total paid salary and remaining balance of the company account.\n");
        int no = scanner.nextInt();
        switch (no) {
            case 1:
                gradeOne.employee1info();
                gradeTwo.employee1info();
                gradeThree.employee1info();
                gradeThree.employee2info();
                gradeFour.employee1info();
                gradeFour.employee2info();
                gradeFive.employee1info();
                gradeFive.employee2info();
                gradeSix.employee1info();
                gradeSix.employee2info();
                break;
            case 2:
                System.out.println("Enter basic salary");
                double bSalary = scanner.nextDouble();
                gradeOne.setBS(bSalary);
                gradeTwo.setBS(bSalary);
                gradeThree.setBS(bSalary);
                gradeFour.setBS(bSalary);
                gradeFive.setBS(bSalary);
                gradeSix.setBS(bSalary);
                /////////
                gradeOne.employee1info();
                gradeTwo.employee1info();
                gradeThree.employee1info();
                gradeThree.employee2info();
                gradeFour.employee1info();
                gradeFour.employee2info();
                gradeFive.employee1info();
                gradeFive.employee2info();
                gradeSix.employee1info();
                gradeSix.employee2info();
                break;
            case 3:
                System.out.println("Enter basic salary");
                double basicSalary = scanner.nextDouble();

                System.out.println("Enter Total salary");
                double totalAmount = scanner.nextDouble();

                salaryManagement.setBS(basicSalary);
                salaryManagement.setTotalAmount(totalAmount);

                if (salaryManagement.salaryCount() >= 0) {
                    System.out.println("Remaining amount: " + salaryManagement.salaryCount());
                    System.out.println("Total paid amount: " + (totalAmount - salaryManagement.salaryCount()));
                } else {
                    System.out.println("You have not sufficient money please input sufficient amount: ");
                    while (true) {
                        System.out.println("if you want to research press 1 otherwise press 2 ");
                        int number = scanner.nextInt();
                        if (number == 1) {
                            System.out.println("Enter additional salary amount");
                            totalAmount = scanner.nextDouble();
                            salaryManagement.setTotalAmount(totalAmount);
                            if (salaryManagement.salaryCount() >= 0) {
                            System.out.println("Remaining amount: " + salaryManagement.salaryCount());
                            System.out.println("Total paid amount: " + (salaryManagement.getTotalAmount() - salaryManagement.salaryCount()));
                            break;}
                            else{
                                System.out.println("You don't input sufficient amount. Please press 1 for sufficient amount otherwise press 2");
                            }
                        } else if (number == 2) {
                            break;
                        }


                    }
                }


        }

    }
}
