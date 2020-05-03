import java.util.Scanner;

public class JavaStaticInitializationBlock {
    public static void main(String [] arg){
        int B, H;
        Scanner scanner= new Scanner(System.in);
        B= scanner.nextInt();
        H= scanner.nextInt();
        if(B>0 && H>0){
            System.out.println(B*H);
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
