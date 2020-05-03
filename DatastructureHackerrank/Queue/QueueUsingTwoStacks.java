package DatastructureHackerrank.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Queue<Long> queue= new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        int no,n=scanner.nextInt();
        long x;
        for (int i = 0; i < n; i++) {
            no=scanner.nextInt();
            if(no==1){
                x=scanner.nextLong();
                queue.add(x);
            }else if(no==2){
                queue.poll();
            }else if(no==3){
                for (int j = 0; j < queue.size(); j++) {
                    //System.out.println();
                }
            }
        }

    }
}
