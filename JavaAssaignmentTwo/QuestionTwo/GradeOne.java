package JavaAssaignmentTwo.QuestionTwo;

public class GradeOne extends SalaryManagement {

    private String name = "Sazid karim";
    private String grade = "Grade One";
    private String address = "Feni sadar";
    private String mobileNo = "00000000000";

    private double savings = 0;
    private double bankBalance=bankBalanceforEmployee1();
    private String accountName = "Ac-001";
    private int accountNumber = 111239;
    private String bank = "Islami bank";
    private String branchName = "ctg";

    public double savingsforEmployee1() {
        double total=setBS(basicSalary)*0.2*0.15;
        return savings += total + 25000;
    }

    public double bankBalanceforEmployee1(){
        double total=setBS(basicSalary)+(setBS(basicSalary)*0.2*0.15) + 25000;
        return total;
    }


    public void employee1info() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + bankBalanceforEmployee1());
    }

}
