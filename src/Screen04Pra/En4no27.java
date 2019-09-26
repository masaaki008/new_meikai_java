package Screen04Pra;

import java.util.Random;
import java.util.Scanner;

public class En4no27 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int ans_num = rand.nextInt(100);

        System.out.println("数当てゲームスタート");
        System.out.println("10回で当ててください");

        for (int i = 10; i > 0; i--) {
            System.out.print("整数:");
            int n = stdIn.nextInt();

            if (n > ans_num) {
                System.out.println("大きいです\n残り" + (i - 1));
            } else if (n < ans_num) {
                System.out.println("小さいです\n残り" + (i - 1));
            } else {
                System.out.println("正解");
                break;
            }

            if (i - 1 == 0)
                System.out.println("正解は" + ans_num);
        }

    }
}
