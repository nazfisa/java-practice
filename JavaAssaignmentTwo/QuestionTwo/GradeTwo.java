package JavaAssaignmentTwo.QuestionTwo;

public class GradeTwo extends SalaryManagement {

    private String name = "Sazid khan";
    private String grade = "Grade two";
    private String address = "Feni sadar";
    private String mobileNo = "010000000000";

    private double savings = 0;
    private String accountName = "Ac-002";
    private int accountNumber = 111233;
    private String bank = "Islami bank";
    private String branchName = "ctg";

    public double bankBalanceforEmployee1(){
        double total=setBS(basicSalary)+(setBS(basicSalary)*0.2*0.15) + 20000;
        return total;
    }


    public void employee1info() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + bankBalanceforEmployee1());
    }

}
