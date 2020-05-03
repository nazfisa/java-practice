package JavaAssaignmentTwo.QuestionTwo;

public class GradeThree extends SalaryManagement {

    private String name = "Salim ullah";
    private String grade = "Grade Three";
    private String address = "Feni sadar";
    private String mobileNo = "01827601000";

    private String name1 = "Salim khan";
    private String grade1 = "Grade Three";
    private String address1 = "Feni sadar";
    private String mobileNo1 = "01827601000";
    private double savings = 0;
    private String accountName = "Ac-003";
    private int accountNumber = 111234;
    private String bank = "Islami bank";
    private String branchName = "ctg";

    private double savings1 = 0;
    private String accountName1 = "Ac-004";
    private int accountNumber1 = 111235;
    private String bank1 = "Islami bank";
    private String branchName1 = "ctg";

    public double bankBalanceforEmployee1(){
        double total=setBS(basicSalary)+(setBS(basicSalary)*0.2*0.15) + 15000;
        return total;
    }

    public void employee1info() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + bankBalanceforEmployee1());
    }

    public void employee2info() {
        System.out.println("Name: " + name1);
        System.out.println("Grade: " + grade1);
        System.out.println("Salary: " + bankBalanceforEmployee1());
    }

}
