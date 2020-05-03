package JavaAssaignmentTwo.QuestionTwo;

public class GradeFour extends SalaryManagement {

    private String name = "Sabbir ullah";
    private String grade = "Grade Four";
    private String address = "Feni sadar";
    private String mobileNo = "01827601000";

    private String name1 = "Sabbir khan";
    private String grade1 = "Grade Four";
    private String address1 = "Feni sadar";
    private String mobileNo1 = "01827601000";


    private double savings = 0;
    private String accountName = "Ac-005";
    private int accountNumber = 111236;
    private String bank = "Islami bank";
    private String branchName = "ctg";

    private double savings1 = 0;
    private String accountName1 = "Ac-006";
    private int accountNumber1 = 111237;
    private String bank1 = "Islami bank";
    private String branchName1 = "ctg";

    public double bankBalanceforEmployee1(){
        double total=setBS(basicSalary)+(setBS(basicSalary)*0.2*0.15) + 10000;
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

