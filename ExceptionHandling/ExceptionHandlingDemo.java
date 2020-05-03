package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        while(true){
            try{
                Scanner scanner= new Scanner(System.in);
                System.out.println("enter the first number");
                int firstNo=scanner.nextInt();
                System.out.println("enter the Second number");
                int secondNo=scanner.nextInt();
                int result= firstNo/secondNo;
                System.out.println(result);
            }catch (Exception e){
                System.out.println("Exception: "+e);
            }
        }

    }
}
