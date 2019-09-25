package Screen03Pra;

import java.util.Scanner;

public class En3no2 {
    public static void main(String[] args) {
        // 2つの整数値を読み込んで、後者が前者の約数か確認
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A:"); int a = stdIn.nextInt();
        System.out.print("整数B:"); int b = stdIn.nextInt();

        if (a % b == 0)
            System.out.println("BはAの約数です");
        else
            System.out.println("BはAの約数ではありません");
    }
}
