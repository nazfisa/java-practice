package DatastructureHackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int q = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack st = new Stack();
        for(int i=0; i< q; i++){
            int oprn = scanner.nextInt();
            switch(oprn){
                case 1 : {
                    String W = scanner.next();
                    st.push(sb.toString());
                    sb.append(W);
                    break;
                }case 2 : {
                    st.push(sb.toString());
                    int k = scanner.nextInt();
                    st.push(sb.toString());
                    sb.delete(sb.length() - k, k);
                    break;
                }case 3 :{
                    int p = scanner.nextInt();
                    System.out.println(sb.toString().charAt(p-1));
                    break;
                }case 4 :{
                    sb.delete(0, sb.length());
                    sb.append(st.pop());
                    break;
                }

            }}
    }
}
