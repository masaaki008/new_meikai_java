package Screen06Pra;

import java.util.Scanner;

public class En6no17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[][] tensu = new int[6][2];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((i + 1) + "番目の");
                if (j == 0) {
                    System.out.print("国語の点数:");
                    tensu[i][j] = stdIn.nextInt();
                } else {
                    System.out.print("数学の点数:");
                    tensu[i][j] = stdIn.nextInt();
                }
            }
            System.out.println();
        }

        double kokugo = 0;
        double suugaku = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 6; i++) {
            sum1 += tensu[i][0];
            sum2 += tensu[i][1];
        }

        kokugo = sum1 / 6;
        suugaku = sum2 / 6;
    }
}
