package Screen04Pra;

import java.util.Scanner;

public class En4no9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("nの値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        int num = 1;
        int i = 1;
        while (i <= n) {
            num *= i;
            i++;
        }
        System.out.println("1から" + n + "までの積は" + num);
    }
}
