package JavaAssaignmentTwo.QuestionTwo;

import java.util.Scanner;

public class SalaryManagement {
    Scanner scanner = new Scanner(System.in);
    public double basicSalary;
    private double totalAmount = 0;
    public double setBS(double bSalary) {

        return basicSalary = bSalary;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount += totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double salaryCount() {
        double totalSalary = basicSalary + (basicSalary * 0.20 * 0.15);
        totalSalary *= 10;
        totalSalary = totalSalary + 105000;
        return totalAmount - totalSalary;
    }


}
