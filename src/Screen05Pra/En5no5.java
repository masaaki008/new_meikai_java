package Screen05Pra;

import java.util.Scanner;

public class En5no5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数x:"); int x = stdIn.nextInt();
        System.out.print("整数y:"); int y = stdIn.nextInt();
        System.out.print("整数z:"); int z = stdIn.nextInt();

        int sum = x + y + z;
        double ave = (double)(x + y + z) / 3;

        System.out.println("合計:" + sum);
        System.out.println("平均:" + ave);
    }
}
