package DatastructureHackerrank.Stack;


import java.util.*;


public class BalancedBracked {


    public static void main(String[] args) {

        String S;
        Scanner scanner = new Scanner(System.in);

        S = scanner.nextLine();
        boolean flag = true;
        int len = S.length();
        for (int i = 0; i < len / 2; i++) {
            if (S.charAt(i) != S.charAt(len - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }


}




