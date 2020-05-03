import java.util.Scanner;

public class ForLoopPractice1 {
    public static void main(String [] arg){
        int inputNumber,i,multiplication;
        Scanner Scan= new Scanner(System.in);
        inputNumber=Scan.nextInt();
        for(i=1;i<11;i++)
        {
            multiplication=i*inputNumber;
            System.out.println(inputNumber+" x "+i+" = "+multiplication);
        }
    }
}
