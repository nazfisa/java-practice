import java.awt.*;
import java.util.Scanner;

public class Java1DArrayPart2 {
    public static void main(String[] arg){
        int q,n,leap,flag;
        int [] array= new int[101];
        Scanner scanner= new Scanner(System.in);
        q= scanner.nextInt();

        for(int i=0;i<q;i++){
            flag=0;
            n=scanner.nextInt();
            leap= scanner.nextInt();
            for(int j=0;j<n;j++){
                array[j]=scanner.nextInt();
            }
            for(int j=0;j<n-leap;j++){
                if(array[j]==1){
                    flag=1;
                    break;
                }

            }
            if(flag==1){
                System.out.println("NO");
            }else
            {
                System.out.println("YES");
            }

        }
    }

}
