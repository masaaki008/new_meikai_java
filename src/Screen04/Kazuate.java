package Screen04;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        // 数当てゲーム(0～99を当てる)
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始");
        System.out.println("0～99の数を当ててください");

        int x;
        do {
            System.out.print("いくつ:");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("もっと小さいです");
            else if (x < no)
                System.out.println("もっと大きいです");
        } while (x != no);

        System.out.println("正解");
    }
}
