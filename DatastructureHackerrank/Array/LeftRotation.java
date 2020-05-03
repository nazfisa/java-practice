package DatastructureHackerrank.Array;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n,d,t;
        n=scanner.nextInt();
        d=scanner.nextInt();
        t=d%n;
        int[] array= new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=scanner.nextInt();
        }
        if(t==0){
            System.out.println(array);
        }
        else {
            for (int i = t; i <n ; i++) {
                System.out.print(array[i]+" ");
            }
            for (int i = 0; i <t ; i++) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
