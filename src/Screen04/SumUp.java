package Screen04;

import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        // 1～nまでの和を求める
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます");
        int n;
        do {
            System.out.print("nの値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1から" + n + "までの和は" + sum + "です");
    }
}
