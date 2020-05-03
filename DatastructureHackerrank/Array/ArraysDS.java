package DatastructureHackerrank.Array;

import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        int[] number = new int[N];
        for(int i=0;i<N;i++){
            number[i]=scanner.nextInt();
        }
        for(int i=N-1;i>=0;i--){
            System.out.print(number[i]+" ");
        }
    }
}
