package DatastructureHackerrank.Queue;

import java.util.PriorityQueue;

public class JavaQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<Integer>();
        for(int i=10;i>0;i--){
            number.add(i);
        }
        //Queue: (front) 10 9 8 7 6 5 4 3 2 1 (rare)
        //PriorityQueue sorts the data for us
        //Queue: (front) 1 2 3 4 5 6 7 8 9 10 (rare) | sorted one
        //peeking --> obtaining the head of queue
        //pull--> removing the head of queue
        System.out.println("Queue size is :"+number.size());
        System.out.println(number.peek());

        number.poll();
        System.out.println("Queue size is :"+number.size());
        System.out.println(number.peek());

        // Display contents of the queue.
        System.out.println("Elements of queue-"+number);

        // To remove the head of queue.
        int removedele = number.remove();
        System.out.println("removed element-" + removedele);
        System.out.println(number);

    }
}
