import java.util.Scanner;

public class JavaIfElse {
    public static void main(String [] arg){
        int inputNumber;
        Scanner number= new Scanner(System.in);
            inputNumber=number.nextInt();

            if(inputNumber%2==1)
            {
                System.out.println("Weird");
            }
            else{
                if(inputNumber>=2 && inputNumber<=5)
                {
                    System.out.println("Not Weird");
                }
                else if(inputNumber>=6 && inputNumber<=20)
                {
                    System.out.println("Weird");
                }
                else{
                    System.out.println("Not Weird");
                }
            }
        }
    }

