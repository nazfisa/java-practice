package DatastructureHackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2,n3,x,y,S1sum=0,S2sum=0,S3sum=0;

        n1=scanner.nextInt();
        n2=scanner.nextInt();
        n3=scanner.nextInt();
        int[] s1=new int[n1];
        int[] s2=new int[n2];
        int[] s3=new int[n3];
        for (int i = 0; i < n1; i++) {
            x=scanner.nextInt();
            s1[i]=x;
            S1sum+=x;
        }
        for (int i = 0; i < n2; i++) {
            x=scanner.nextInt();
            s2[i]=x;
            S2sum+=x;
        }
        for (int i = 0; i < n3; i++) {
            x= scanner.nextInt();
            s3[i]=x;
            S3sum+=x;
        }

        while(true){

            if(S1sum==S2sum && S1sum== S3sum){
                System.out.println(S1sum);
                break;
            }
            else if(S1sum>S2sum && S1sum> S3sum){
                int b=0;
                y=s1[b];
                S1sum-=y;
                b++;
            }else if(S2sum>S1sum && S2sum>S3sum){
                int c=0;
                y=s2[c];
                S2sum-=y;
                c++;
            }else if(S3sum>S1sum && S3sum>S2sum){
                int d=0;
                y=s3[d];
                S3sum-=y;
                d++;
            }

        }
    }
}
