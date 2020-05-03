import java.util.Scanner;

public class ArrayImplementation {
    public static void main(String [] arg){
        int collection[]= new int[5];
        int sumTotalNumber=0,tracker;
        Scanner number= new Scanner(System.in);
        for(int i=0; i<5;i++){
            tracker=i+1;
            System.out.println("Enter the number"+tracker);
            collection[i]=number.nextInt();
            sumTotalNumber+=collection[i];
        }
        System.out.println("Summation of total numbers is: "+sumTotalNumber);
    }
}
