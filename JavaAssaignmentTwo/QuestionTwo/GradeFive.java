package JavaAssaignmentTwo.QuestionTwo;

public class GradeFive extends SalaryManagement {

    private String name = "Mahmud ullah";
    private String grade = "Grade Five";
    private String address = "Feni sadar";
    private String mobileNo = "01827601000";

    private String name1 = "Mahmud khan";
    private String grade1 = "Grade Three";
    private String address1 = "Feni sadar";
    private String mobileNo1 = "01827601000";

    private double savings1 = 0;
    private String accountName1 = "Ac-008";
    private int accountNumber1 = 111238;
    private String bank1 = "Islami bank";
    private String branchName1 = "ctg";

    private double savings2 = 0;
    private String accountName2 = "Ac-009";
    private int accountNumber2 = 111240;
    private String bank2 = "Islami bank";
    private String branchName2 = "ctg";


    public double bankBalanceforEmployee1(){
        double total=setBS(basicSalary)+(setBS(basicSalary)*0.2*0.15) + 5000;
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
