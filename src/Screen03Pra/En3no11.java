package Screen03Pra;

import java.util.Scanner;

public class En3no11 {
    public static void main(String[] args) {
        // 2つの整数の差が10以下か違うかを表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        int diff = a > b ? a - b : b - a;

        if (diff <= 10)
            System.out.println("それらの差は10以下です");
        else
            System.out.println("それらの差は11以上です");
    }
}
