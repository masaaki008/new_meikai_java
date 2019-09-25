package Screen03Pra;

import java.util.Scanner;

public class En3no14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        int max, min;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        if (a == b) {
            System.out.println("2つの値は同じです");
        } else {
            System.out.println("大きい値は" + max);
            System.out.println("小さい値は" + min);
        }
    }
}
