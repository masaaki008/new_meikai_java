package Screen04Pra;

import java.util.Random;
import java.util.Scanner;

public class En4no2 {
    public static void main(String[] args) {
        // 2桁の値(10～99)を当てる
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(90) + 10;

        System.out.println("スタート");
        int x;

        do {
            System.out.print("いくつ:");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("大きいです");
            else if (x < no)
                System.out.println("小さいです");

        } while (x != no);

        System.out.println("正解");
    }
}
