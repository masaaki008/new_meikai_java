package Screen04Pra;

import java.util.Scanner;

public class En4no18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "の2乗は" + (i * i));
        }
    }
}
