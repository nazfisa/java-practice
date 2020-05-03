package DatastructureHackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int n, a, b, x, y;
        long sum, count;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            x = scanner.nextInt();
            int[] array1= new int[a];
            int[] array2= new int[b];

            sum = 0;
            count = 0;
            for (int j = 0; j < a; j++) {
                array1[i]=scanner.nextInt();
               // System.out.println(array1[i]);
            }
            for (int j = 0; j < b; j++) {
                array2[i]=scanner.nextInt();
            }
            for (int j = 0; j < a; j++) {
                stack1.push(array1[j]);
                System.out.println("Stack1 "+stack1.peek());

            }
            for (int j = 0; j < b; j++) {
                stack2.push(array2[j]);
            }
            System.out.println(stack1.peek());
            System.out.println(stack2.peek());
//           while (true) {
//                if (sum > x) {
//                    System.out.println(count);
//                    break;
//                }
//                else if (stack1.peek() >= stack2.peek()) {
//                   sum += stack1.pop();
//                   count++;
//               } else if (stack1.peek() <= stack2.peek()) {
//                  sum += stack2.pop();
//                  count++;
//               }
//           }

        }

    }
}
