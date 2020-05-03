package DatastructureHackerrank.Array;

import java.util.Scanner;

public class TwoDArrayDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, max = -100000;
        int[][] number = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                number[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < 6 - 2; i++) {
            for (int j = 0; j < 6 - 2; j++) {
                sum = number[i][j] + number[i][j + 1] + number[i][j + 2]
                        + number[i + 1][j + 1] + number[i + 2][j] + number[i + 2][j + 1] + number[i + 2][j + 2];

                if (sum > max) {
                    max = sum;

                }
            }

        }
        System.out.println(max);

    }
}
