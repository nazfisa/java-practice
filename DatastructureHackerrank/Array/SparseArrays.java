package DatastructureHackerrank.Array;

import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        int noOfStrings,noOfQuery;
        Scanner scanner= new Scanner(System.in);

        noOfStrings= scanner.nextInt();
        String [] strings= new String[noOfStrings];

        for (int i = 0; i <noOfStrings ; i++) {
            strings[i]=scanner.next();
        }

        noOfQuery=scanner.nextInt();
        String [] queries= new String[noOfQuery];
        int[] tracking= new int[noOfQuery];
        for (int i = 0; i < noOfQuery; i++) {
            queries[i]=scanner.next();
        }

        for (int i = 0; i < noOfQuery; i++) {
            for (int j = 0; j < noOfStrings; j++) {
                if(queries[i].equals(strings[j])){
                    tracking[i]+=1;
                }
            }

        }

        for (int i = 0; i < noOfQuery; i++) {
            System.out.println(tracking[i]);
        }


    }
}
