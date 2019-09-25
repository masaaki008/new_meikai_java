package Screen02Pra;

import java.util.Random;
import java.util.Scanner;

public class En2no8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        int plus_minus_num = (n - 5) + rand.nextInt(11);
        System.out.println("入力した値のプラスマイナス5の乱数は" + plus_minus_num);

    }
}
