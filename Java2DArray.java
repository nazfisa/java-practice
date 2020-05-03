import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] arg){
        Scanner scanner= new Scanner(System.in);
        int [][] array= new int[6][6];
        int sum,max=-10000;
        for (int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){

               sum= (array[i][j]+array[i][j+1]+array[i][j+2])+
                       (array[i+1][j+1])+
                       (array[i+2][j]+array[i+2][j+1]+array[i+2][j+2]);
                if(max<sum){
                    max=sum;
                }

        }

    }
     System.out.println(max);
}}
