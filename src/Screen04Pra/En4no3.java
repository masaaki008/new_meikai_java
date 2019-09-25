package Screen04Pra;

import java.util.Scanner;

public class En4no3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A:"); int a = stdIn.nextInt();
        System.out.print("整数B:"); int b = stdIn.nextInt();

        int min, max;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        do {
            System.out.print(min + " ");
            min = min + 1;
        } while (min <= max);

        System.out.println();
    }
}
