package Screen03Pra;

import java.util.Scanner;

public class En3no8 {
    public static void main(String[] args) {
        // 入力した値を評価する
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:"); int n = stdIn.nextInt();

        if (n >= 0 && n <= 59)
            System.out.println("不可");
        else if (n >= 60 && n <= 69)
            System.out.println("可");
        else if (n >= 70 && n <= 79)
            System.out.println("良");
        else if (n >= 80 && n <= 100)
            System.out.println("優");
    }
}
