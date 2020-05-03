import java.util.Scanner;

public class Java1DArray {
    public static void main(String [] arg){
        Scanner scanner= new Scanner(System.in);
        int testCase;
        int [] array= new int[1000];
        testCase= scanner.nextInt();
       for(int i=0;i<testCase;i++){
           array[i]=scanner.nextInt();
       }
        for(int i=0;i<testCase;i++){
            System.out.println(array[i]);
        }
    }
}
