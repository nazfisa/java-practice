import java.util.Scanner;

public class JavaSubstring {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
