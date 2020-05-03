package StringPakage;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String  getSmallestAndLargest(String s1, int k){

        String s2,minS="",maxS="";
        int len=s1.length();
        minS=s1.substring(0,k);
        maxS=s1.substring(0,k);
        for(int i=0;i<=len-k;i++){
            s2=s1.substring(i,i+k);
            if(minS.compareTo(s2)<=0){
                minS=s2;
            }else{
                maxS=s2;
            }
        }
        return maxS+"\n"+minS;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
