import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] arg){
        ArrayList<ArrayList<Integer>> lists= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int n,m,x,y;
        n= scanner.nextInt();

        for(int i=0;i<n;i++){
            ArrayList<Integer> list= new ArrayList<>();
            m=scanner.nextInt();
            for(int j=0;j<m;j++)
            list.add(scanner.nextInt());
            lists.add(list);
        }
        m= scanner.nextInt();
        for(int i=0;i<m;i++){
            x=scanner.nextInt();
            y=scanner.nextInt();
            ArrayList<Integer> list=lists.get(x-1);
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
