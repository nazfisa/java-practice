package StringPakage;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        String S, S2;
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
//        StringBuffer SB= new StringBuffer(S);
//        S2=SB.reverse().toString();
//        if(S.equals(S2)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
        boolean flag=true;
        int len = S.length();
        for (int i = 0; i < len / 2; i++) {
            if (S.charAt(i) != S.charAt(len - i-1)) {
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
