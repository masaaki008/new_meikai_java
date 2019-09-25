package Screen03;

import java.util.Scanner;

public class Sort2 {
    public static void main(String[] args) {
        // 2つの変数を昇順にソート
        Scanner stdIn = new Scanner(System.in);

        System.out.print("変数a:"); int a = stdIn.nextInt();
        System.out.print("変数b:"); int b = stdIn.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("a <= bとなるようにソートしました");
        System.out.println("変数aは" + a);
        System.out.println("変数bは" + b);
    }
}
