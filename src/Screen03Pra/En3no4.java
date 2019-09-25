package Screen03Pra;

import java.util.Scanner;

public class En3no4 {
    public static void main(String[] args) {
        // 2つの整数値を読み込んで大小比較
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        if (a > b)
            System.out.println("aのほうが大きいです");
        else if (a < b)
            System.out.println("bのほうが大きいです");
        else
            System.out.println("aとbは同じです");
    }
}
