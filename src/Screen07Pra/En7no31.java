package Screen07Pra;

import java.util.Scanner;

public class En7no31 {
    static int absolute(int x) {
        if (x > 0)
            return x;
        else
            return -x;
    }

    static long absolute(long x) {
        if (x > 0)
            return x;
        else
            return -x;
    }

    static float absolute(float x) {
        if (x > 0)
            return x;
        else
            return -x;
    }

    static double absolute(double x) {
        if (x > 0)
            return x;
        else
            return -x;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("値x1:"); int x1 = stdIn.nextInt();
        System.out.print("値x2:"); long x2 = stdIn.nextLong();
        System.out.print("値x3:"); float x3 = stdIn.nextFloat();
        System.out.print("値x4:"); double x4 = stdIn.nextDouble();

        System.out.println("x1の絶対値:" + absolute(x1));
        System.out.println("x2の絶対値:" + absolute(x2));
        System.out.println("x3の絶対値:" + absolute(x3));
        System.out.println("x4の絶対値:" + absolute(x4));
    }
}
