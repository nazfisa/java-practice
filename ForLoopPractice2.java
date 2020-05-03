import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String [] arg){
        Scanner scanner= new Scanner(System.in);
        int i=0,noOfTestCase,a,b,n,copya,k,total;
        noOfTestCase=scanner.nextInt();
        while(i<noOfTestCase){
            a=scanner.nextInt();
            b=scanner.nextInt();
            n=scanner.nextInt();

            for(int j=0;j<n;j++){
                copya=a;
                total=0;
                for(k=0;k<=j;k++){
                    total+=(int)Math.pow(2,k)*b;
                }
                System.out.print(copya+total+" ");
                copya=0;
            }
            System.out.println();
            i++;
        }
    }
}
